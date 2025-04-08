package com.SpringBootformValidation.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.SpringBootformValidation.dto.StudentDto;
import com.SpringBootformValidation.models.Student;
import com.SpringBootformValidation.repository.StudentRepository;
import com.SpringBootformValidation.services.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {
	private final StudentService studentService;
	private final StudentRepository studentRepository;

	public StudentController(StudentService studentService, StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
		this.studentService = studentService;
	}

	@GetMapping({ "", "/" })
	public String home(Model model) {
		List<Student> students = studentService.getAllStudents();
		model.addAttribute("students", students);
		return "home";
	}

	@GetMapping({ "/add-student" })
	public String addStudent(Model model) {
		model.addAttribute("StudentDto", new StudentDto());
		return "add-student";

	}

	@PostMapping("/add-student")
	public String addStudent(@Valid @ModelAttribute StudentDto studentDto, BindingResult result, Model model,
			RedirectAttributes attributes) {
		if(studentDto.getImage().isEmpty()) {
			result.addError(new FieldError("studentDto", "image", "image is required"));
		}
		if (result.hasErrors()) {
			return "add-student";
		}
		System.out.println(studentDto.getName() + "2");
		studentService.saveStudent(studentDto);
		attributes.addFlashAttribute("success", "Student added successfully");
		return "redirect:/";

	}

	@GetMapping("/std-delete")
	public String deleteStudent(@RequestParam(name = "id") Long id) {
		studentService.deleteStudent(id);
		return "redirect:/";
	}

	@GetMapping("/std-edit")
	public String editStudent(@RequestParam(name = "id") Long id, Model model) {
		StudentDto studentDto = studentService.editStudent(id);
		Student student = studentRepository.findById(id).get();
		model.addAttribute("studentDto", studentDto);
		model.addAttribute("student", student);// it use for id and path
		return "edit-student";
	}

	@PostMapping("/edit-student")
	public String updateStudent(@Valid @ModelAttribute StudentDto studentDto, BindingResult result, Model model,
			@RequestParam(name = "id") Long id) {
		Student student1=studentRepository.findByEmail(studentDto.getEmail());
		if(student1!= null && student1.getId()!=id) {
			result.addError(new FieldError("studentDto","email","email is already exists"));
		}
		
		if (result.hasErrors()) {
			Student student = studentRepository.findById(id).get();
			model.addAttribute("student", student);
			model.addAttribute("studentDto", studentDto);
			return "edit-student";
		}
		studentService.updateStudent(studentDto, id);
		return "redirect:/";

	}
}

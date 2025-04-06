package com.SpringBootformValidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SpringBootformValidation.DTO.StudentDTO;
import com.SpringBootformValidation.service.StudentService;


@Controller
public class StudentController {
	
	private final StudentService studentService;
	//constructor injection
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	@GetMapping({"/add-student"})
	public String addStudent(Model model) {
		model.addAttribute("studentDTO", new StudentDTO());
		return "add_student";
	}
	@PostMapping({"/add-student"})
	public String addStudent(@ModelAttribute StudentDTO studentDTO) {
//		model.addAttribute("studentDTO", new StudentDTO());
		studentService.saveStudent(studentDTO);
		return "redirect:/";
	}
}
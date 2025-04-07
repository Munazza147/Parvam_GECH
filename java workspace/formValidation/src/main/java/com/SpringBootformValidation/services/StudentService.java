package com.SpringBootformValidation.services;

import java.awt.im.InputContext;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.SpringBootformValidation.dto.StudentDto;
import com.SpringBootformValidation.models.Student;
import com.SpringBootformValidation.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository studentRepository;

	private StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public List<Student> getAllStudents() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	public void saveStudent(StudentDto studentDto) {
		MultipartFile image = studentDto.getImage();
		Date createdAt = new Date();
		String storeImageName = createdAt.getTime() + "_" + image.getOriginalFilename();
		System.out.println(storeImageName);

		try {
			String uploadDir = "public/images";
			Path uploadPath = Paths.get(uploadDir);
			if (!Files.exists(uploadPath)) {
				Files.createDirectories(uploadPath);
			}
			try {
				InputStream inputStream = image.getInputStream();
				Files.copy(inputStream, Paths.get(uploadDir + storeImageName), StandardCopyOption.REPLACE_EXISTING);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		Student student = new Student();
		student.setName(studentDto.getName());
		student.setAge(studentDto.getAge());
		student.setEmail(studentDto.getEmail());
		student.setPassword(studentDto.getPassword());
		student.setImagepath(storeImageName);
		studentRepository.save(student);

	}

	public void deleteStudent(Long id) {
		Student student = studentRepository.findById(id).get();
		//what is the image path of the student
		String uploadDir="public/image";
		Path imagePath = Paths.get(uploadDir+student.getImagepath());
		try {
			Files.delete(imagePath);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
		
		studentRepository.delete(student);

	}

	public StudentDto editStudent(Long id) {
		Student student = studentRepository.findById(id).get();
		StudentDto studentDto = new StudentDto();
		studentDto.setName(student.getName());
		studentDto.setAge(student.getAge());
		studentDto.setEmail(student.getEmail());
		studentDto.setPassword(student.getPassword());
		return studentDto;

	}

	public void updateStudent(StudentDto studentDto, Long id) {
		Student student = studentRepository.findById(id).get();
		if(!studentDto.getImage().isEmpty()) {
			Path oldImagePath= Paths.get("public/image/"+student.getImagepath());
			try {
				Files.delete(oldImagePath);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			MultipartFile image = studentDto.getImage();
			Date createdAt = new Date();
			String storeImageName = createdAt.getTime() + "_" + image.getOriginalFilename();
			String uploadDir = "public/images";
			try {
				InputStream inputStream = image.getInputStream();
				Files.copy(inputStream, Paths.get(uploadDir + storeImageName), StandardCopyOption.REPLACE_EXISTING);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			student.setImagepath(storeImageName);
		}
		student.setName(studentDto.getName());
		student.setAge(studentDto.getAge());
		student.setEmail(studentDto.getEmail());
		student.setPassword(studentDto.getPassword());
		studentRepository.save(student);

	}

}
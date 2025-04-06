package com.SpringBootformValidation.service;

import org.springframework.stereotype.Service;

import com.SpringBootformValidation.DTO.StudentDTO;
import com.SpringBootformValidation.models.Student;
import com.SpringBootformValidation.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	public void saveStudent(StudentDTO studentDTO) {
		Student student = new Student();
		student.setName(studentDTO.getName());
		student.setEmail(studentDTO.getEmail());
		student.setAge(studentDTO.getAge());
		student.setPassword(studentDTO.getPassword());
		studentRepository.save(student);
	}

}

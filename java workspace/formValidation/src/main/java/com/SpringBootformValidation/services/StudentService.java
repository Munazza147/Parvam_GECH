package com.SpringBootformValidation.services;

import java.io.IOException;
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

    private final StudentRepository studentRepository;

    // Constructor injection for StudentRepository
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Save student along with image
    public void saveStudent(StudentDto studentDto) {
        MultipartFile image = studentDto.getImage();
        Date createdAt = new Date();
        String storeImageName = createdAt.getTime() + "_" + image.getOriginalFilename();
        System.out.println("Saving image with name: " + storeImageName);

        try {
            // Define image upload directory
            String uploadDir = "public/images/";
            Path uploadPath = Paths.get(uploadDir);

            // Create directory if it doesn't exist
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            // Save the image file
            try (InputStream inputStream = image.getInputStream()) {
                Files.copy(inputStream, uploadPath.resolve(storeImageName), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                throw new RuntimeException("Failed to upload the image: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error while creating directory or saving file: " + e.getMessage());
        }

        // Create and save student
        Student student = new Student();
        student.setName(studentDto.getName());
        student.setAge(studentDto.getAge());
        student.setEmail(studentDto.getEmail());
        student.setPassword(studentDto.getPassword());
        student.setImagepath(storeImageName); // Set image path for the student
        studentRepository.save(student);
    }

    // Delete student along with image
    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        
        // Correcting image path directory
        String uploadDir = "public/images";  // Ensure this matches the directory in save and update methods
        Path imagePath = Paths.get(uploadDir, student.getImagepath());
        
        try {
            // Delete the image file
            Files.delete(imagePath);
        } catch (IOException e) {
            System.out.println("Error while deleting the image: " + e.getMessage());
        }

        // Delete the student from the database
        studentRepository.delete(student);
    }

    // Edit student details (retrieve current data to pre-populate the form)
    public StudentDto editStudent(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        StudentDto studentDto = new StudentDto();
        studentDto.setName(student.getName());
        studentDto.setAge(student.getAge());
        studentDto.setEmail(student.getEmail());
        studentDto.setPassword(student.getPassword());
        return studentDto;
    }

    // Update student and their image
    public void updateStudent(StudentDto studentDto, Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));

        // If a new image is provided, delete the old one
        if (!studentDto.getImage().isEmpty()) {
            Path oldImagePath = Paths.get("public/images", student.getImagepath());
            try {
                Files.delete(oldImagePath); // Delete old image
            } catch (IOException e) {
                System.out.println("Error while deleting the old image: " + e.getMessage());
            }

            // Handle the new image file
            MultipartFile image = studentDto.getImage();
            Date createdAt = new Date();
            String storeImageName = createdAt.getTime() + "_" + image.getOriginalFilename();
            String uploadDir = "public/images/";

            try (InputStream inputStream = image.getInputStream()) {
                Files.copy(inputStream, Paths.get(uploadDir).resolve(storeImageName), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                throw new RuntimeException("Failed to upload the new image: " + e.getMessage());
            }

            // Update the student's image path in the database
            student.setImagepath(storeImageName);
        }

        // Update the remaining student details
        student.setName(studentDto.getName());
        student.setAge(studentDto.getAge());
        student.setEmail(studentDto.getEmail());
        student.setPassword(studentDto.getPassword());
        
        // Save the updated student data
        studentRepository.save(student);
    }
}

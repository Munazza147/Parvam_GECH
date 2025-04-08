package com.SpringBootformValidation.dto;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class StudentDto {

    @NotBlank(message = "Student name is required")
    @Size(min = 3, message = "Student name must be at least 3 characters long")
    private String name;

    @Min(value = 10, message = "Age must be at least 10")
    private int age;

    @NotBlank(message = "Student email is required")
    @Email(message = "Please provide a valid email address")
    private String email;

    @NotBlank(message = "Student password is required")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;

    // MultipartFile for the image
    private MultipartFile image;

    // Getters and Setters
    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Optional: Add a constructor if needed
    public StudentDto(String name, int age, String email, String password, MultipartFile image) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.image = image;
    }

    // Optional: Default constructor
    public StudentDto() {}

    // Optional: Override toString() if needed for debugging
    @Override
    public String toString() {
        return "StudentDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", image=" + image.getOriginalFilename() +
                '}';
    }
}

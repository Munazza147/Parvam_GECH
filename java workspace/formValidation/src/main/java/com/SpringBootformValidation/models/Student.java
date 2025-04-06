package com.SpringBootformValidation.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "students")

public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="std_id")
	private long id;
	
	@Column(name="std_name")
	private String name;
	
	@Column(name="std_age")
	private int age;
	
	@Column(name="std_email")
	private String email;
	
	@Column(name="std_password")
	private String password;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public void setAge(int i) {
		this.age = i;
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

}


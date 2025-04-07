package com.SpringBootformValidation.repository;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootformValidation.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	/*
	 * spring data jpa -> hibernate -> jdbc( java database connectio)
	 * ->database
	 * 
	 * 1.to get all details ->findAll()
	 * 2.to get single data ->findbyId(id)
	 * 3.to delete data -> deleteById()
	 * 4.To creste or update->save()*/

}

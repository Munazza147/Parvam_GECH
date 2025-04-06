package com.SpringBootformValidation.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootformValidation.models.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}

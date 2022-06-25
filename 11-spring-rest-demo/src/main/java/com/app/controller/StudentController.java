package com.app.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.bean.Student;
import com.app.exception.handling.CustomErrorResponse;
import com.app.exception.handling.ElementNotFoundException;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class StudentController {
	
	// End point: http//localhost:8080/11-spring-rest-demo/api/students
	
	@GetMapping("/students")
	public List<Student> getAll() {
		return findAll();
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		List<Student> students = findAll();
		
		Optional<Student> opt = students.stream()
				.filter(student -> student.getId() == studentId)
				.findFirst();
		
		if (opt.isPresent()) {
			return opt.get();
		}
		
		throw new ElementNotFoundException("student " + studentId + " not found");
				
	}
	
	// SOAP, REST, GRAPHQL: communication
	// data format: xml, json 
	
	// Banking, Weather
	// Application
	public List<Student> findAll() {
		return Arrays.asList(
				new Student(1, "Student A1"),
				new Student(2, "Student B2"),
				new Student(3, "Student C3")
		);
	}
	
}

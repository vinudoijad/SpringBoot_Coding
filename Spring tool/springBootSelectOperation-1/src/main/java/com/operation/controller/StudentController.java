package com.operation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.operation.model.Student;
import com.operation.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentservice;

	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Integer id) {
		Student student1 = studentservice.getStudentById(id);
		return ResponseEntity.ok().body(student1);

	}

}

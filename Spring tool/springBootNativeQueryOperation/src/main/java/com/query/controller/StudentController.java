package com.query.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.query.model.Student;
import com.query.service.StudentService;

@RestController
public class StudentController {

	// inject the Student service here
	@Autowired
	private StudentService studentService;

	@GetMapping("/getcity/{city}")
	public ResponseEntity<List<Student>> getStudentByCity(@PathVariable("city") String city) {
		List<Student> student = studentService.getListByCity(city);
		return ResponseEntity.ok().body(student);

	}

}

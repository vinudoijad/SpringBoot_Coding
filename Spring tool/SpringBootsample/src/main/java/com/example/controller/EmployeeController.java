package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@RestController   //developing a RESTful web service
public class EmployeeController {
	
	// design method which return student name
	
	@GetMapping("/getDetails")
	public String getDemo() {
		return "ram";
	}

	//design the Restful web services which return the student
	
	@GetMapping("/getStudentList")
	public List getStudentList() {
		List list = new ArrayList();
		list.add("Vinayak");
		list.add("Ketan");
		list.add("Shubham");
		return list;
	}
	
	//design restful web services which return the employee
	@GetMapping("/getEmployeeData")
	public Employee getEmployeeData() {
		Employee employee = new Employee();
		employee.setName("Yash");
		employee.setCity("Ratnagiri");
		return employee;
	}
}

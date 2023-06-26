package com.query.service;

import java.util.List;

import com.query.model.Student;

public interface StudentService {

	public List<Student> getListByCity(String city);
}

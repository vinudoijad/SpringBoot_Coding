package com.operation.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operation.model.Student;
import com.operation.repository.StudentRepository;
import com.operation.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentrepository;

	@Override
	public Student getStudentById(Integer id) {
		Student student = studentrepository.findById(id);
		return student;
	}

}

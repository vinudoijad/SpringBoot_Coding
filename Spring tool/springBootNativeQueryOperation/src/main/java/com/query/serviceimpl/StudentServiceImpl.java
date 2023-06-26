package com.query.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.query.model.Student;
import com.query.repository.StudentRepository;
import com.query.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getListByCity(String city) {
		List<Student> student = studentRepository.findByCity(city);
		return student;
	}

}

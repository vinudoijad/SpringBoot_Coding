package com.query.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.query.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Serializable> {

	@Query(value = "select* from student c where city=?1", nativeQuery = true)

	List<Student> findByCity(String city);

}

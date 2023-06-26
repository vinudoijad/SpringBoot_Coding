package com.insurance.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Policy;
import com.insurance.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Serializable> {

	@Query(value = "select * from policy c where userId=?1", nativeQuery = true)
	List<Policy> findByuserId(Integer userId);

}

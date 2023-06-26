package com.update.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vinayak.update.model.UpdateModel;
@Repository
public interface UpdateRepository extends JpaRepository<UpdateModel, Integer> {
	

}

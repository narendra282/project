package com.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.model.studentEntity;

public interface studentRepo extends JpaRepository<studentEntity,Integer>{

	

}

package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.dto.StudentSearchDTO;
import com.training.service.studentSearchService;

@RestController
public class StudentController {

	@Autowired
	studentSearchService service;

	@GetMapping("/students")
	public List<StudentSearchDTO> getStudents() {
		return service.getStudents();
	}
}

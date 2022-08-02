package com.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.dto.StudentSearchDTO;
import com.training.model.studentEntity;
import com.training.repo.studentRepo;

@Service
public class studentSearchService {

	@Autowired
	studentRepo repo;

	public List<StudentSearchDTO> getStudents() {
		List<StudentSearchDTO> students = new ArrayList<>();
		List<studentEntity> entities = repo.findAll();
		for (studentEntity entity : entities) {
			StudentSearchDTO student = new StudentSearchDTO();
			student.setStudentId("" + entity.getStudentId());
			student.setName(entity.getName());
			students.add(student);
		}
		return students;
	}
}

package com.anz.core.service;

import org.springframework.stereotype.Component;

import com.anz.domain.Students;

@Component
public interface StudentsService {
	
	void createStudents(Students stu);
	
	Students getStudents(String name);

}

package com.anz.core.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.anz.core.service.StudentsService;
import com.anz.domain.Students;

@Component
public class StudentsServiceImpl implements StudentsService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void createStudents(Students stu) {
		// TODO Auto-generated method stub

	}

	@Override
	public Students getStudents(String name) {

		Students stu = jdbcTemplate.queryForObject("SELECT s FROM Students s WHERE s.name = 'May Yu'", Students.class);

		return stu;
	}

}

package com.anz.test.lib;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.anz.core.repository.StudentsRepository;
import com.anz.core.serviceimpl.StudentsServiceImpl;
import com.anz.domain.Students;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = com.anz.main.Application.class)
// @WebAppConfiguration
public class StudentsRepositoryTest {

//	@Autowired
//	StudentsServiceImpl StudentsServiceImpl;
	@Autowired
	StudentsRepository studentsRepository;

	Logger log = Logger.getLogger(StudentsRepositoryTest.class);

	@Test
	public void stuRepoTest() {

		log.info(" find db");

		try {

			Students stu = studentsRepository.findStudent("Victor, Huang");
			System.out.println("Stu found : " + stu.getId() + " : " + stu.getSex());
		} catch (Exception e) {

			log.info("Error Found when find db");

			e.printStackTrace();
		}
	}

//	@Test
//	public void stuJdbcTemplateTest() {
//		
//		Students stu = StudentsServiceImpl.getStudents("");
//		System.out.println("Stu found : " + stu.getId() + " : " + stu.getSex());
//		
//	}
	
	
	@Test
	public void testTest(){
		log.info(" <<<<<<<<<<<<<<<<<<<<<  msg print testing >>>>>>>>>>>>>>>>>>");
	}

}

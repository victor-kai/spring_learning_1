package com.anz.core.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.anz.domain.Students;

@RepositoryRestResource
public interface StudentsRepository extends CrudRepository<Students, Long> {
	
	Students findByName(String name);
	
	Students findByNameAndAge(String name, Integer age);
	
	@Query("FROM Students s WHERE s.name = :name")
	Students findStudent(@Param("name") String name);

}

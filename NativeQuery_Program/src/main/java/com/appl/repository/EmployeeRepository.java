package com.appl.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appl.model.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee	, Serializable>{

	@Query(value = "select * from employee where city=?1",nativeQuery = true)
	List<Employee> findByCity(String city);
	
}

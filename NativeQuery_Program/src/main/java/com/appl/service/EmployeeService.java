package com.appl.service;

import java.util.List;

import com.appl.model.Employee;

public interface EmployeeService {

	public List<Employee> getListByCity(String city);
	
}

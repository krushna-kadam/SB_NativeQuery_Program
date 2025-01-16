package com.appl.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appl.model.Employee;
import com.appl.repository.EmployeeRepository;
import com.appl.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getListByCity(String city) {
		List<Employee> emp = employeeRepository.findByCity(city);
		return emp;
	}

}

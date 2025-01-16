package com.appl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.appl.model.Employee;
import com.appl.service.EmployeeService;

@RestController
public class EmployeeController {

	// how to inject service
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getCity/{city}")
	public ResponseEntity <List<Employee>> getListByCity(@PathVariable("city") String city) {
		
		List<Employee> emp =  employeeService.getListByCity(city);
		
		return ResponseEntity.ok().body(emp);
		
	}
}

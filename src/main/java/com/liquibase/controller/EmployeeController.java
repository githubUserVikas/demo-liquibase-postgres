package com.liquibase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.liquibase.dao.EmployeeRepositiry;
import com.liquibase.entity.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepositiry repositiry;

	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee) {
		repositiry.save(employee);
		return "Employee saved sucessfully";
	}
	
	@GetMapping("/getAllEmplyees")
	public List<Employee> getAll(){
		return repositiry.findAll();
	}
	
	public List<Employee> getEmployeeByDept(@PathVariable String dept ){
		return repositiry.findByDept(dept);
	}
}

package com.liquibase.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liquibase.entity.Employee;

public interface EmployeeRepositiry extends JpaRepository<Employee, Integer>{

	List<Employee> findByDept(String dept);

}

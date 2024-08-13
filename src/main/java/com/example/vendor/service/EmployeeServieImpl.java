package com.example.vendor.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vendor.dao.EmployeeRepository;
import com.example.vendor.model.Employee;

@Service
public class EmployeeServieImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll() ;
	}

	@Override
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

//	@Override
//	public Employee findEmployeeById(Long id) {
//		return employeeRepository.findById(id);
//	}

	

	
	




}

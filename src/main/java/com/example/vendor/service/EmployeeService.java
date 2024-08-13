package com.example.vendor.service;


import java.util.List;

import com.example.vendor.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	
	public Employee save( Employee employee);

//	public Employee findEmployeeById(Long id);
	
//	public Employee createEmployee(Employee employee);



}

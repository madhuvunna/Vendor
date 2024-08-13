package com.example.vendor.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vendor.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String>{

	Employee findById(Long id);

	
}

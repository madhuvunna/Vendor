package com.example.vendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vendor.model.Employee;
import com.example.vendor.service.EmployeeService;


//@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping("/api")
public class EmployeeContoller {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getEmployee")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee>emp=null;
		emp=employeeService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(emp,HttpStatus.ACCEPTED);
		}

	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> save(@RequestBody Employee employee) {
		employee = employeeService.save(employee);
		return ResponseEntity.ok(employee);
	}
//	@PostMapping("/postEmployee")
//	public Employee createEmployee(@RequestBody Employee employee) {
//		return employeeService.createEmployee(employee);
//
//	}
}

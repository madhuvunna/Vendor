package com.example.vendor.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
//@AllArgsConstructor
//@NoArgsConstructor
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	
//	private String name;
//	private String designation;
//	private String ctc;
//	private String email;
	@Column(name = "Id")
	private int id;
	
	@Column(name="Name")
	private String name;

	@Column(name="Designation")
	private String designation;

	@Column(name="Ctc")
	private double ctc;

	@Column(name="Email")
	private String email;

	public Employee(int id, String name, String designation, double ctc, String email) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.ctc = ctc;
		this.email = email;
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getCtc() {
		return ctc;
	}

	public void setCtc(double ctc) {
		this.ctc = ctc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", ctc=" + ctc + ", email="
				+ email + "]";
	}
	
	

		
	

}

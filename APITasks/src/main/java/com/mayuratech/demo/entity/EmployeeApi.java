package com.mayuratech.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="EmployeeAPItable")
public class EmployeeApi {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	@Size(min=3,message="Name should consists atleast 3 characters")
	@Column(name="name")
	private String name;
	
	@NotEmpty
	@Column(name="salary")
	private String salary;
	
	@NotEmpty
	@Size(min=2,message="department should consists atleast 2 characters")
	@Column(name="department")
	private String department;


	public EmployeeApi() {
	}

	public EmployeeApi(int id, String name, String salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeApi [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
}

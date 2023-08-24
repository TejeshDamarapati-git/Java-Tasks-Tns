package com.mayuratech.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springdoc.api.OpenApiResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayuratech.demo.entity.EmployeeApi;
import com.mayuratech.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/apiemployeestask")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeRepository employeerepository;
	
	@Autowired
	public EmployeeController(EmployeeRepository employeerepository) {
		this.employeerepository = employeerepository;
	}

	@GetMapping
	public List<EmployeeApi> getAllEmployees(){
		return employeerepository.findAll();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<EmployeeApi> getEmployeesById(@Valid  @PathVariable (value="id")Integer id){
		
		EmployeeApi employeeid = employeerepository.findById(id)
				.orElseThrow(()->new OpenApiResourceNotFoundException("Employee doesnt exist with the given id"+id));
		return ResponseEntity.ok().body(employeeid);
		
	}
}

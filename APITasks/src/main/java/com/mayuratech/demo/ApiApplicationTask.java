package com.mayuratech.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.mayuratech.demo.controller.EmployeeController;
import com.mayuratech.demo.controller.UserController;
import com.mayuratech.demo.entity.EmployeeApi;
import com.mayuratech.demo.entity.User;
import com.mayuratech.demo.repository.EmployeeRepository;
import com.mayuratech.demo.repository.UserRepository;

@SpringBootApplication
public class ApiApplicationTask implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ApiApplicationTask.class, args);
		}

	@Autowired
	private UserRepository userrepository;
	@Autowired
	private UserController usercontroller;
//	
//	@Autowired
//	private EmployeeRepository employeeepository;
//	@Autowired
//	private EmployeeController employeecontroller;
//	
	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setId(401);
//		user.setName("abay");
//		user.setAccountNum("85296310001");
//		user.setBalance("2330");
//		userrepository.save(user);
//		System.out.println("saved user"+userrepository.save(user));
//		usercontroller.createUser(user);
		//updateUserBank
//		usercontroller.updateUser(401, user);
		
//		EmployeeApi employeeapi=new EmployeeApi();
//		employeeapi.setDepartment("IT");
//		employeeapi.setId(108);
//		employeeapi.setName("msd");
//		employeeapi.setSalary("1800000");
//		employeeepository.save(employeeapi);
//		System.out.println(employeeapi);
		
//		employeecontroller.getEmployeesById(1);
//
//		//getAllEmployees using loop
//		List<EmployeeApi> allEmployees = employeecontroller.getAllEmployees();
//		for (EmployeeApi employeeapi1:allEmployees) {
//		System.out.println(employeeapi1.toString());
//			}
		
	}
	}


package com.mayuratech.demo.controller;

import javax.validation.Valid;

import org.springdoc.api.OpenApiResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mayuratech.demo.entity.User;
import com.mayuratech.demo.repository.UserRepository;

@RestController
@RequestMapping("/userapi")
public class UserController {
	
	@Autowired
	private UserRepository userrepository;
	
	@PostMapping
	public User createUser(@Valid User user) {
		return userrepository.save(user);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<User> updateUser( @PathVariable("id") Integer id,@RequestBody User userdetails){
		User updateuser=userrepository.findById(id)
				.orElseThrow(()->new OpenApiResourceNotFoundException("user doesnt existwith the given id"+id));
		updateuser.setName(userdetails.getName());
		updateuser.setAccountNum(userdetails.getAccountNum());
		updateuser.setBalance(userdetails.getBalance());
		userrepository.save(updateuser);
		return ResponseEntity.ok(updateuser);
	}

}

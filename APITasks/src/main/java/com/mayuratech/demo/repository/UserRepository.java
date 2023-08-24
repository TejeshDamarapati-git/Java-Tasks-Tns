package com.mayuratech.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.mayuratech.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

//	Object findByUsername(String username);

}

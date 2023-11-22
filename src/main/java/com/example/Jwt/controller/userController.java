package com.example.Jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Jwt.Model.User;
import com.example.Jwt.service.UserService;
@RestController("/user")
public class userController {
	@Autowired
	UserService userService;
	@GetMapping("/users")
	 public List<User> getUsers() {
		return userService.getUser();
		 
		 
		 
	}
	

}

package com.example.Jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Jwt.Model.User;
import com.example.Jwt.repository.UserRepo;
import com.example.Jwt.repository.UserRepo;

@Service
public class UserService {
	
	
	@Autowired
	UserRepo userRepo;
	
	public List<User> getUser() {
		return userRepo.findAll();
	}
	

}

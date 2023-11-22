package com.example.Jwt.repository;

import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.Jwt.Model.User;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository

public interface UserRepo extends JpaRepository<User,Integer> {

}

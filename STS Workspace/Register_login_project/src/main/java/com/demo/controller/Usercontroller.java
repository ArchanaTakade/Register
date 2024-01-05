package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.UserEntity;
import com.demo.model.UserModel;
import com.demo.service.Userservice;
	
@RestController
public class Usercontroller {
	@Autowired
	private Userservice userService;
	
	    @PostMapping("/signup")
	    public ResponseEntity<Object> signUp(@RequestBody UserModel user) {
	    	userService.signUp(user);
	        return new ResponseEntity<>(HttpStatus.OK).ok("Successfully SignUp");
	    }

	    @PostMapping("/login")
	    public ResponseEntity<Object> login(@RequestParam String username, @RequestParam String password) {
	        UserEntity user = userService.login(username, password);
	        return new ResponseEntity<>(HttpStatus.OK).ok("Logged In Successfully");
	    }

	    @GetMapping("/dashboard")
	    public ResponseEntity<Object> getDashboard(@RequestParam String username) {
	    	UserEntity user = userService.login(username, "");
	        return new ResponseEntity<>(HttpStatus.OK).ok("Welcome to the DashBoard");
	    }
	}

	

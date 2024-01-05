package com.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.UserEntity;
import com.demo.exceptions.AccountAlreadyRegisteredException;
import com.demo.exceptions.AccountNotFoundException;
import com.demo.exceptions.InvalidPasswordException;
import com.demo.model.UserModel;
import com.demo.repository.UserRepository;

@Service
public class Userservice {

	
	    @Autowired
		static UserRepository userRepository;

	    public  void signUp(UserModel user) {
	   Optional<UserEntity> user1 = userRepository.findById(user.getUsername());
	    	if(user1.isPresent()) {
	    		throw new AccountAlreadyRegisteredException("You Already have Register with same username");
	    	}
	    	else {
	    		UserEntity userEntity = new UserEntity(user.getUsername(),user.getPassword(),user.getFullName(),"40");
	    		userRepository.save(userEntity);
	    	}
	       
	    }

	    public UserEntity login(String username, String password) {
	        Optional<UserEntity> user = userRepository.findById(username);
	        if(!user.isPresent()) {
		        throw new AccountNotFoundException("Account Not Found");

	        }else {
	        	if(user.get().getPassword().equals(password)) {
	        		return user.get();
	        	}
	        	else {
	        		throw new InvalidPasswordException("Please Enter Valid Password");
	        	}
	        }
	        
	    }
	}

	

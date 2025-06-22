package com.project.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.project.springsecurity.expection.ResourceNotFoundExpection;
import com.project.springsecurity.model.User;
import com.project.springsecurity.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User createUser(User user) {
		
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	@Override
	public User getUserById(Long userId) {
		
		return userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundExpection("Given Id user not found"+userId));
	}

}

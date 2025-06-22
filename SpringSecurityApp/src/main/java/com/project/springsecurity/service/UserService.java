package com.project.springsecurity.service;

import java.util.List;

import com.project.springsecurity.model.User;

public interface UserService {
	
	//addUser
	User createUser(User user);
	
	//get All user
	List<User> getAllUser();
	
	//getUserById
	User getUserById(Long userId);

}

package com.project.springsecurity.controller;

import java.util.List;
import com.project.springsecurity.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.springsecurity.model.User;
import com.project.springsecurity.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServiceImpl userServiceImpl;
	
	@Autowired
	private UserService userService;

    UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }
	
	@PostMapping("")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
		
	}
	@GetMapping("")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	@GetMapping("/{userId}")
	public User getUserById(@PathVariable("userId") Long userId) {
		return userService.getUserById(userId);
	}

}

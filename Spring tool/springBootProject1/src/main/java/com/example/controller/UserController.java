package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@RestController
public class UserController {

	// inject the User Service
	@Autowired
	private UserService userService;

	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		return userService.saveUserDetails(user);
	}

	@PutMapping("/updateUser/{userId}")
	public User updateUser(@PathVariable("userId") Integer userId, @RequestBody User user) {
		return userService.updateUserDetails(userId, user);

	}

	@GetMapping("/getUser/{userId}")
	public User getUser(@PathVariable("userId") Integer userId) {
		return userService.getUserDetails(userId);

	}

	@GetMapping("/fetchAllUserDetails")
	public List<User> fetchAllUserDetails() {
		return userService.fetchAllUserDetails();

	}

	@DeleteMapping("/deleteUser/{userId}")
	public void deleteUser(@PathVariable("userId") Integer userId) {
		userService.deletUserDetails(userId);

	}
}

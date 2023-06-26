package com.example.service;

import java.util.List;

import com.example.model.User;

public interface UserService {

	// save user
	public User saveUserDetails(User user);

	// update user
	public User updateUserDetails(Integer UserId, User user);

	// get user details by UserId
	public User getUserDetails(Integer UserId);

	// get all details of user
	public List<User> fetchAllUserDetails();

	//Delete User Details
	public void deletUserDetails(Integer userId);

}

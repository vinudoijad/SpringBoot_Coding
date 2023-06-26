package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	// inject the User Repository
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUserDetails(User user) {
		return userRepository.save(user);

	}

	@Override
	public User updateUserDetails(Integer UserId, User user) {
		User us = userRepository.findById(UserId);
		User use = null;
		if (us == null) {
			throw new NullPointerException("the given Id us Null");
		} else {
			us.setUserName(user.getUserName());
			us.setUserMailId(user.getUserMailId());
			us.setCity(user.getCity());
		}
		return use;
	}

	@Override
	public User getUserDetails(Integer UserId) {
		return userRepository.findById(UserId);

	}

	@Override
	public List<User> fetchAllUserDetails() {
		return (List<User>) userRepository.findAll();

	}

	@Override
	public void deletUserDetails(Integer userId) {
		userRepository.deleteById(userId);

	}

}

package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.User;
import com.insurance.repository.UserRepository;
import com.insurance.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	// inject the user Repository
	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUser(Integer userId) {
		User user = userRepository.findById(userId).orElse(null);

		return user;
	}

}

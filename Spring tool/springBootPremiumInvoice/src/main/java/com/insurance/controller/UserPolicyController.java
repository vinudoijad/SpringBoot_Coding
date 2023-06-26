package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Policy;
import com.insurance.model.User;
import com.insurance.service.PolicyService;
import com.insurance.service.UserService;

@RestController
@RequestMapping("/policy")
public class UserPolicyController {

	// Inject the UserService And PolicyService

	@Autowired
	private PolicyService policyService;

	@Autowired
	private UserService userService;

	@GetMapping("/policyDetails/{userId}")
	public ResponseEntity<User> getUserPolicy(@PathVariable("userId") Integer userId) {
		User user = userService.getUser(userId);
		List<Policy> policies = user.getPolicyList();
		for (Policy policy : policies) {
			policy.setNomineeId(user.getUserId());
			policyService.savePolicy(policy);

		}
		return ResponseEntity.ok().body(user);

	}

}

package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Policy;
import com.insurance.repository.PolicyRepository;
import com.insurance.service.PolicyService;
@Service
public class PolicyServiceImpl implements PolicyService {

	// inject the PolicyRepository
	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public Policy savePolicy(Policy policy) {
		return policyRepository.save(policy);

	}

}

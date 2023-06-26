package com.update.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.update.repository.UpdateRepository;
import com.vinayak.update.model.UpdateModel;
import com.vinayak.update.service.UpdateService;
@Service
public class UpdateServiceImpl implements UpdateService{
	
	//Inject the Update Repository
	@Autowired
	private UpdateRepository updateRepository;

	@Override
	public UpdateModel updatePremiumDetails(UpdateModel updateModel) {
		updateRepository
		return null;
	}

}

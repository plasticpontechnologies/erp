package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SetupTermsDateDetails;
import com.plasticon.erp.repository.SetupTermsDateRepository;



@Service
public class SetupTermsDateService {

	@Autowired
    SetupTermsDateRepository setupTermsDateRepository;
	
	public List<SetupTermsDateDetails> getSetupTermsDateDetails() {
		return setupTermsDateRepository.findAll();
	}
	 

	public void saveSetupTermsDateDetails(SetupTermsDateDetails setupTermsDate) {
		setupTermsDateRepository.save(setupTermsDate);
	}

	@Transactional
	public void removeSetupTermsDateDetails(int id) {
	      setupTermsDateRepository.deleteById(id);
	}
}

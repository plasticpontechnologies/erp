package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SetupExamTermsDetails;
import com.plasticon.erp.repository.SetupExamTermsRepository;

@Service
public class SetupExamTermsService {
	
	@Autowired
	SetupExamTermsRepository setupExamTermsRepository;
	
  
	public List<SetupExamTermsDetails> getSetupExamTermsDetails() {
		return setupExamTermsRepository.findAll();
	}
	 

	public void saveSetupExamTermsDetails(SetupExamTermsDetails setupExamTerms) {
		setupExamTermsRepository.save(setupExamTerms);
	}

	@Transactional
	public void removeSetupExamTermsDetails(int id) {
	      setupExamTermsRepository.deleteById(id);
	}

}

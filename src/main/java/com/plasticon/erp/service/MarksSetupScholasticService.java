package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.MarksSetupScholasticDetails;
import com.plasticon.erp.model.SetupExamTermsDetails;
import com.plasticon.erp.repository.MarksSetupScholasticRepository;
import com.plasticon.erp.repository.SetupExamTermsRepository;

@Service
public class MarksSetupScholasticService {
	
	@Autowired
	MarksSetupScholasticRepository marksSetupScholasticRepository;
	
	  
	public List<MarksSetupScholasticDetails> getMarksSetupScholasticDetails() {
		return marksSetupScholasticRepository.findAll();
	}
	 

	public void saveMarksSetupScholasticDetails(MarksSetupScholasticDetails msus) {
		marksSetupScholasticRepository.save(msus);
	}

	@Transactional
	public void removeMarksSetupScholasticDetails(int id) {
	      marksSetupScholasticRepository.deleteById(id);
	}

}

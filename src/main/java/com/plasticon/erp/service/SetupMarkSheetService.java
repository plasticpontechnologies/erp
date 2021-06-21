package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SetupMarkSheetDetails;
import com.plasticon.erp.repository.SetupMarkSheetRepository;

@Service
public class SetupMarkSheetService {

	@Autowired
	SetupMarkSheetRepository setupMarkSheetRepository;
	
	public List<SetupMarkSheetDetails> getSetupMarkSheetDetails() {
		return setupMarkSheetRepository.findAll();
	}
	 

	public void saveSetupmarkSheetDetails(SetupMarkSheetDetails setupMarkSheet) {
		setupMarkSheetRepository.save(setupMarkSheet);
	}

	@Transactional
	public void removeSetupMarkSheetDetails(int id) {
	      setupMarkSheetRepository.deleteById(id);
	}
}

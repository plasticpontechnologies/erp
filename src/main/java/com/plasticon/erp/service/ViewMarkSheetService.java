package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SetupMarkSheetDetails;
import com.plasticon.erp.model.ViewMarkSheetDetails;
import com.plasticon.erp.repository.SetupMarkSheetRepository;
import com.plasticon.erp.repository.ViewMarkSheetRepository;



@Service
public class ViewMarkSheetService {

	@Autowired
	ViewMarkSheetRepository viewMarkSheetRepository;
	
	public List<ViewMarkSheetDetails> getViewMarkSheetDetails() {
		return viewMarkSheetRepository.findAll();
	}
	 

	public void saveViewMarkSheetDetails(ViewMarkSheetDetails viewmarksheet) {
		viewMarkSheetRepository.save(viewmarksheet);
	}

	@Transactional
	public void removeViewMarkSheetDetails(int id) {
	      viewMarkSheetRepository.deleteById(id);
	}
}

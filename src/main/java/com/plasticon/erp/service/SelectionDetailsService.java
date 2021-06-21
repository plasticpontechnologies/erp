package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SectionDetails;
import com.plasticon.erp.model.SelectionDetails;
import com.plasticon.erp.repository.SelectionDetailsRepository;

@Service
public class SelectionDetailsService {

	@Autowired
	SelectionDetailsRepository selectiondetailsRepository;
	
	public List<SelectionDetails> getSelectionDetails() {
		return selectiondetailsRepository.findAll();

	}

	public void saveSelectionDetails(SelectionDetails select) {
		selectiondetailsRepository.save(select);
	}

	@Transactional
	public void removeSelectionDetails(int id) {
		selectiondetailsRepository.deleteById(id);
	}


}

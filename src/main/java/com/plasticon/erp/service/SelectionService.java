package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SectionDetails;
import com.plasticon.erp.model.Selection;
import com.plasticon.erp.repository.SelectionRepository;

@Service
public class SelectionService {
	
	@Autowired
	SelectionRepository selectionRepository;

	public List<Selection> getSelectionDetails() {
		return selectionRepository.findAll();

	}

	public void saveSelectionDetails(Selection sel) {
		selectionRepository.save(sel);
	}

	@Transactional
	public void removeSelectionDetails(int id) {
		selectionRepository.deleteById(id);
	}
}

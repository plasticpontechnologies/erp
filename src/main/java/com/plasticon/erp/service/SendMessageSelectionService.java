package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SectionDetails;
import com.plasticon.erp.model.SendMessageSelection;
import com.plasticon.erp.repository.SendMessageSelectionRepository;

@Service
public class SendMessageSelectionService {
	
	@Autowired
	SendMessageSelectionRepository selectionRepository;

	public List<SendMessageSelection> getSelectionDetails() {
		return selectionRepository.findAll();

	}

	public void saveSelectionDetails(SendMessageSelection sel) {
		selectionRepository.save(sel);
	}

	@Transactional
	public void removeSelectionDetails(int id) {
		selectionRepository.deleteById(id);
	}
}

package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.plasticon.erp.model.StaffDetails;
import com.plasticon.erp.model.StaffDocumentDetails;
import com.plasticon.erp.repository.StaffDocumentRepository;

@Service
public class StaffDocumentService {
	
	@Autowired
	StaffDocumentRepository staffDocumentRepository;

	public List<StaffDocumentDetails> getStaffDocumentDetails() {
		return staffDocumentRepository.findAll();
	}
	 

	public void saveStaffDocumentDetails(StaffDocumentDetails staffDocument) {
		staffDocumentRepository.save(staffDocument);
	}

	@Transactional
	public void removeStaffDocumentDetails(int id) {
		staffDocumentRepository.deleteById(id);
	}


}

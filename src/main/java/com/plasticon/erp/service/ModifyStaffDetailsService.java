package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ModifyStaffDetails;
import com.plasticon.erp.repository.ModifyStaffDetailsRepository;

@Service
public class ModifyStaffDetailsService {

	@Autowired
	ModifyStaffDetailsRepository modifyStaffDetailsRepository;
	
	public List<ModifyStaffDetails> getModifyStaffDetails() {
		return modifyStaffDetailsRepository.findAll();

	}

	public void saveModifyStaffDetails(ModifyStaffDetails modifystaff) {
		modifyStaffDetailsRepository.save(modifystaff);
	}

	@Transactional
	public void removeModifyStaffDetails(int id) {
		modifyStaffDetailsRepository.deleteById(id);
	}
}

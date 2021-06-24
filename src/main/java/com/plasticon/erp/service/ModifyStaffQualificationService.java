package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ModifyStaffQualificationDetails;
import com.plasticon.erp.repository.ModifyStaffQualificationRepository;

@Service
public class ModifyStaffQualificationService {

	@Autowired
    ModifyStaffQualificationRepository modifyStaffQualificationRepository;
	
	public List<ModifyStaffQualificationDetails> getModifyStaffQualificationDetails() {
		return modifyStaffQualificationRepository.findAll();

	}

	public void saveModifyStaffQualificationDetails(ModifyStaffQualificationDetails modifystaffqualification) {
		modifyStaffQualificationRepository.save(modifystaffqualification);
	}

	@Transactional
	public void removeModifyStaffQualificationDetails(int id) {
		modifyStaffQualificationRepository.deleteById(id);
	}
}

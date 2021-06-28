package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SendSmsToOthers;
import com.plasticon.erp.model.StaffLoginDetails;
import com.plasticon.erp.repository.StaffLoginDetailsRepository;

@Service
public class StaffLoginDetailsService {

	@Autowired
	public StaffLoginDetailsRepository stafflogindetailsRepository;
	
	public List<StaffLoginDetails> getStaffLoginDetails() {
		return stafflogindetailsRepository.findAll();

	}

	public void saveStaffLoginDetails(StaffLoginDetails stafflog) {
		stafflogindetailsRepository.save(stafflog);
		
	}
	@Transactional
	public void removeStaffLoginDetails(int id) {
		stafflogindetailsRepository.deleteById(id);
	}
}

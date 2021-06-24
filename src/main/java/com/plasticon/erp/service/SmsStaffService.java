package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ClassDetails;
import com.plasticon.erp.model.RouteTo;
import com.plasticon.erp.model.SendSmsToStaff;
import com.plasticon.erp.repository.SmsStaffRepository;

@Service
public class SmsStaffService {

	
	@Autowired
	public SmsStaffRepository smsstaffRepository;
	
	
	public List<SendSmsToStaff> getSendSmsToStaff() {
		return smsstaffRepository.findAll();

	}
	public void saveSendSmsToStaff(SendSmsToStaff smsstaff) {
		smsstaffRepository.save(smsstaff);
			}
	
	@Transactional
	public void removeSendSmsToStaff(int id) {
		smsstaffRepository.deleteById(id);
	}
}
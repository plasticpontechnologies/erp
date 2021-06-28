package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.EnquiryMessage;
import com.plasticon.erp.model.SendSmsToStaff;
import com.plasticon.erp.repository.EnquiryMessageRepository;

@Service
public class EnquiryMessageService {

	
	@Autowired
	public EnquiryMessageRepository enquirymessageRepository;
	
	public List<EnquiryMessage> getEnquiryMessage() {
		return enquirymessageRepository.findAll();

	}
	public void saveEnquiryMessage(EnquiryMessage enquirymessage) {
		enquirymessageRepository.save(enquirymessage);
			}
	
	@Transactional
	public void removeEnquiryMessage(int id) {
		enquirymessageRepository.deleteById(id);
	}
}

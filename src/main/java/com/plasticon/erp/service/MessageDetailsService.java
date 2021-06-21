package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Message;
import com.plasticon.erp.model.MessageDetails;
import com.plasticon.erp.repository.MessageDetailsRepository;
import com.plasticon.erp.repository.MessageRepository;

@Service
public class MessageDetailsService {

	
	@Autowired
	MessageDetailsRepository messagedetailsRepository;
	
	
	
	public List<MessageDetails> getMessageDetails() {
		return messagedetailsRepository.findAll();

	}

	public void saveMessageDetails(MessageDetails message) {
		messagedetailsRepository.save(message);
		

	}
	@Transactional
	public void removeMessageDetails(int id) {
		messagedetailsRepository.deleteById(id);
	}
}


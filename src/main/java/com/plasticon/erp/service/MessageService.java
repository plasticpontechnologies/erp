package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Message;
import com.plasticon.erp.repository.MessageRepository;

@Service
public class MessageService {

	
	
	@Autowired
	MessageRepository messageRepository;

	public List<Message> getMessage() {
		return messageRepository.findAll();

	}

	public void saveMessage(Message msg) {
		messageRepository.save(msg);
		

	}
	@Transactional
	public void removeMessage(int id) {
		messageRepository.deleteById(id);
	}
}

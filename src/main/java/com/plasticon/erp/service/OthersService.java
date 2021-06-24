package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.MenuDetails;
import com.plasticon.erp.model.SendSmsToOthers;
import com.plasticon.erp.repository.OthersRepository;

@Service
public class OthersService {

	@Autowired
	public OthersRepository othersRepository;
	
	public List<SendSmsToOthers> getSendSmsToOthers() {
		return othersRepository.findAll();

	}

	public void saveSendSmsToOthers(SendSmsToOthers others) {
		othersRepository.save(others);
		
	}
	@Transactional
	public void removeSendSmsToOthers(int id) {
		othersRepository.deleteById(id);
	}

}

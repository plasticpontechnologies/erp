package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.TransferClass;
import com.plasticon.erp.repository.TransferClassRepository;

@Service
public class TransferClassService  {
	
	@Autowired
	TransferClassRepository transferClassRepository;
	
	public List<TransferClass> getTransferClass() {
		return transferClassRepository.findAll();

	}

	public void saveTransferClass(TransferClass students) {
		transferClassRepository.save(students);
	}

	@Transactional
	public void removeTransferClass(int id) {
		transferClassRepository.deleteById(id);
	}


}

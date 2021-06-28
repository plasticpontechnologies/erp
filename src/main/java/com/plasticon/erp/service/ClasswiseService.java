package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Caste;
import com.plasticon.erp.model.SendSmsToClassWise;
import com.plasticon.erp.repository.ClassWiseRepository;

@Service
public class ClasswiseService {

	@Autowired
	public ClassWiseRepository classwiseRepository;
	
	public List<SendSmsToClassWise> getSendSmsToClassWise() {
		return classwiseRepository.findAll();

	}

	public void saveSendSmsToClassWise(SendSmsToClassWise classwise) {
		classwiseRepository.save(classwise);
	}

	@Transactional
	public void removeSendSmsToClassWise(int id) {
		classwiseRepository.deleteById(id);
	}
	
	}

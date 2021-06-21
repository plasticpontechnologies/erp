package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.GenerateIdCardDetails;

import com.plasticon.erp.repository.GenerateIdcardRepository;


@Service
public class GenerateIdCardService {
	@Autowired
    GenerateIdcardRepository generateIdcardRepository;
	
	public List<GenerateIdCardDetails> getGenerateIdCardDetails() {
		return generateIdcardRepository.findAll();
	}
	 

	public void saveGenerateIdCardDetails(GenerateIdCardDetails generateIdCard) {
		generateIdcardRepository.save(generateIdCard);
	}

	@Transactional
	public void removeGenerateIdCardDetails(int id) {
		generateIdcardRepository.deleteById(id);
	}

}

package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.GenerateIdentityCard;
import com.plasticon.erp.model.GenerateIdentityCard;
import com.plasticon.erp.repository.GenerateIdentityCardRepository;

@Service
public class GenerateIdentityCardService {
	@Autowired
	GenerateIdentityCardRepository generateIdentityCardRepository;
	
	public List<GenerateIdentityCard> getGenerateIdentityCard() {
		return generateIdentityCardRepository.findAll();

	}

	public void saveGenerateIdentityCard(GenerateIdentityCard generateIdentityCard) {
		generateIdentityCardRepository.save(generateIdentityCard);
	}

	@Transactional
	public void removeGenerateIdentityCard(int id) {
		generateIdentityCardRepository.deleteById(id);
	}

}

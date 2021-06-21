package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Promotion;
import com.plasticon.erp.repository.PromotionRepository;

@Service
public class PromotionService {

	@Autowired
	PromotionRepository promotionRepository;
	
	public List<Promotion> getPromotion() {
		return promotionRepository.findAll();

	}

	public void savePromotion(Promotion students) {
		promotionRepository.save(students);
	}

	@Transactional
	public void removePromotion(int id) {
		promotionRepository.deleteById(id);
	}
}

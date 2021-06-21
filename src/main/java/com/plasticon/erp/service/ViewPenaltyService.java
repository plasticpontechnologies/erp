package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ViewPenalty;
import com.plasticon.erp.repository.ViewPenaltyRepository;

@Service
public class ViewPenaltyService {
	@Autowired
	ViewPenaltyRepository viewPenaltyRepository;
	
	public List<ViewPenalty>getViewPenalty(){
	return viewPenaltyRepository.findAll();
	}
	
	public void saveViewPenalty(ViewPenalty ManagePenalty) {
		viewPenaltyRepository.save(ManagePenalty);
		
	}
	@Transactional
	public void removeViewPenalty(int id) {
		viewPenaltyRepository.deleteById(id);
	}

}

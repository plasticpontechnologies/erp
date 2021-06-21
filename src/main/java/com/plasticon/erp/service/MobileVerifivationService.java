package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.MobileVerifivation;
import com.plasticon.erp.repository.MobileVerifivationRepository;

@Service 
public class MobileVerifivationService {
	
	@Autowired
	MobileVerifivationRepository mobileVerifivationRepository;
	
	public List<MobileVerifivation> getMobileVerifivation(){
		 return mobileVerifivationRepository.findAll();
	}
	
	public void saveMobileVerifivation(MobileVerifivation mobileverification) {
		mobileVerifivationRepository.save(mobileverification);
	}
	
	public void removeMobileVerifivation(int id) {
		mobileVerifivationRepository.deleteById(id);
	}

}

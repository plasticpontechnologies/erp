package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Gender;
import com.plasticon.erp.repository.GenderRepository;

@Service
public class GenderService {
	@Autowired
	GenderRepository genderRepository;
	
	public List<Gender> getGender() {
		return genderRepository.findAll();

	}

	public void saveGender(Gender gender) {
		genderRepository.save(gender);
	}

	@Transactional
	public void removeGender(int id) {
		genderRepository.deleteById(id);
	}
	
	
	
}

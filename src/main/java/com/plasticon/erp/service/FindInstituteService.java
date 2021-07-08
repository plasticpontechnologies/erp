package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.plasticon.erp.model.FindInstitutes;
import com.plasticon.erp.repository.FindInstituteRepository;

@Service
public class FindInstituteService {

	@Autowired
	FindInstituteRepository findInstituteRepository;
	
	public List<FindInstitutes> getInstituteName() {
		return findInstituteRepository.findAll();
	}
	
	public void saveFindInstitute(FindInstitutes findinstitute) {
		findInstituteRepository.save(findinstitute);
	}
	
	@Transactional
	public void removeFindInstitute(int id) {
		findInstituteRepository.deleteById(id);
	}
}

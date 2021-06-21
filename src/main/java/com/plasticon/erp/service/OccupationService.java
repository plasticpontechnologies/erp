package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Occupation;
import com.plasticon.erp.repository.OccupationRepository;

@Service
public class OccupationService {
	@Autowired
	OccupationRepository occupationRepository;
	
	public List<Occupation> getOccupation() {
		return occupationRepository.findAll();

	}

	public void saveOccupation(Occupation occupation) {
		occupationRepository.save(occupation);
	}

	@Transactional
	public void removeOccupation(int id) {
		occupationRepository.deleteById(id);
	}


}

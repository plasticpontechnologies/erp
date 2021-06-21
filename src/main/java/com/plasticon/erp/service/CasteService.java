package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Caste;
import com.plasticon.erp.repository.CasteRepository;

@Service
public class CasteService {
	@Autowired
	CasteRepository casteRepository;
	public List<Caste> getCaste() {
		return casteRepository.findAll();

	}

	public void saveCaste(Caste caste) {
		casteRepository.save(caste);
	}

	@Transactional
	public void removeCaste(int id) {
		casteRepository.deleteById(id);
	}
	

}

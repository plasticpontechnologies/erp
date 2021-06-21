package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Binding;
import com.plasticon.erp.model.Division;
import com.plasticon.erp.repository.DivisionRepository;

@Service
public class DivisionService {

	@Autowired
	DivisionRepository divisionRepository;
	
	public List<Division> getDivision() {
		return divisionRepository.findAll();

	}

	public void saveDivision(Division div) {
		divisionRepository.save(div);
		

	}
	@Transactional
	public void removeDivision(int id) {
		divisionRepository.deleteById(id);
	}
}

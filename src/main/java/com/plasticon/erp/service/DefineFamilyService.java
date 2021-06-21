package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.DefineFamily;
import com.plasticon.erp.repository.DefineFamilyRepository;

@Service
public class DefineFamilyService {
	
	@Autowired
	DefineFamilyRepository defineFamilyRepository;
	
	public List<DefineFamily> getDefineFamily() {
		return defineFamilyRepository.findAll();

	}

	public void saveDefineFamily(DefineFamily family) {
		defineFamilyRepository.save(family);
	}

	@Transactional
	public void removeDefineFamily(int id) {
		defineFamilyRepository.deleteById(id);
	}

	
}

package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.DefineFeeType;
import com.plasticon.erp.repository.DefineFeeTypeRepository;

@Service
public class DefineFeeTypeService {
	@Autowired
	private DefineFeeTypeRepository defineFeeTypeRepository;
	
	public List<DefineFeeType> getDefineFeeType() {
		return defineFeeTypeRepository.findAll();

	}

	public void saveDefineFeeType(DefineFeeType defineFeeType) {
		defineFeeTypeRepository.save(defineFeeType);
	}

	@Transactional
	public void removeDefineFeeType(int id) {
		defineFeeTypeRepository.deleteById(id);
	}

	

}

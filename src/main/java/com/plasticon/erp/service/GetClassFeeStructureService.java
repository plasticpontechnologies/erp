package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.GetClassFeeStructure;
import com.plasticon.erp.repository.GetClassFeeStructureRepository;

@Service
public class GetClassFeeStructureService {
	@Autowired
	private GetClassFeeStructureRepository getClassFeeStructureRepository;
	
	public List<GetClassFeeStructure> getGetClassFeeStructure() {
		return getClassFeeStructureRepository.findAll();

	}

	public void saveGetClassFeeStructure(GetClassFeeStructure getClassFeeStructure) {
		getClassFeeStructureRepository.save(getClassFeeStructure);
	}

	@Transactional
	public void removeGetClassFeeStructure(int id) {
		getClassFeeStructureRepository.deleteById(id);
	}

}

package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.FeesDueForEntireFamily;
import com.plasticon.erp.repository.FeesDueForEntireFamilyRepository;

@Service
public class FeesDueForEntireFamilyService {
	@Autowired
	private FeesDueForEntireFamilyRepository feesDueForEntireFamilyRepository;
	
	public List<FeesDueForEntireFamily> getFeesDueForEntireFamily() {
		return feesDueForEntireFamilyRepository.findAll();

	}

	public void saveFeesDueForEntireFamily(FeesDueForEntireFamily feesDueForEntireFamily) {
		feesDueForEntireFamilyRepository.save(feesDueForEntireFamily);
	}

	@Transactional
	public void removeFeesDueForEntireFamily(int id) {
		feesDueForEntireFamilyRepository.deleteById(id);
	}
	

}

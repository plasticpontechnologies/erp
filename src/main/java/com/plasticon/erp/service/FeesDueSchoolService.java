package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.FeesDueSchool;
import com.plasticon.erp.repository.FeesDueSchoolRepository;

@Service
public class FeesDueSchoolService {
	@Autowired
	private FeesDueSchoolRepository feesDueSchoolRepository;
	
	public List<FeesDueSchool> getFeesDueSchool() {
		return feesDueSchoolRepository.findAll();

	}

	public void saveFeesDueSchool(FeesDueSchool feesDueSchool) {
		feesDueSchoolRepository.save(feesDueSchool);
	}

	@Transactional
	public void removeFeesDueSchool(int id) {
		feesDueSchoolRepository.deleteById(id);
	}

}

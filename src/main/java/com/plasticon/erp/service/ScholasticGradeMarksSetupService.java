package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ScholasticGradeMarksSetupDetails;
import com.plasticon.erp.repository.ScholasticGradeMarksSetupRepository;



@Service
public class ScholasticGradeMarksSetupService {
	
	@Autowired
	ScholasticGradeMarksSetupRepository scholasticGradeMarksSetupRepository;
	public List<ScholasticGradeMarksSetupDetails> getScholasticGradeMarksSetupDetails() {
		return scholasticGradeMarksSetupRepository.findAll();
	}
	 

	public void saveScholasticGradeMarksSetupDetails(ScholasticGradeMarksSetupDetails scholasticGradeMarksSetup) {
		scholasticGradeMarksSetupRepository.save(scholasticGradeMarksSetup);
	}

	@Transactional
	public void removeScholasticGradeMarksSetupDetails(int id) {
	      scholasticGradeMarksSetupRepository.deleteById(id);
	}

}

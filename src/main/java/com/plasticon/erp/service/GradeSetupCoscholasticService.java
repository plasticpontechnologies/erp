package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.GradeSetupCoscholasticDetails;
import com.plasticon.erp.repository.GradeSetupCoscholasticRepository;



@Service
public class GradeSetupCoscholasticService {

	@Autowired
	GradeSetupCoscholasticRepository gradeSetupCoscholasticRepository;
	
	public List<GradeSetupCoscholasticDetails> getGradeSetupCoscholasticDetails() {
		return gradeSetupCoscholasticRepository.findAll();
	}
	 

	public void saveGradeSetupCoscholasticDetails(GradeSetupCoscholasticDetails gradesetupCoscholastic) {
		gradeSetupCoscholasticRepository.save(gradesetupCoscholastic);
	}

	@Transactional
	public void removeGradeSetupCoscholasticDetails(int id) {
		gradeSetupCoscholasticRepository.deleteById(id);
	}
}

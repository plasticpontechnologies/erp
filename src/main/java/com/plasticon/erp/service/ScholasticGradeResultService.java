package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ScholasticGradeResultDetails;
import com.plasticon.erp.repository.ScholasticGradeResultRepository;


@Service
public class ScholasticGradeResultService {

	@Autowired
	ScholasticGradeResultRepository scholasticGradeResultRepository;
	
	public List<ScholasticGradeResultDetails> getScholasticGradeResultDetails() {
		return scholasticGradeResultRepository.findAll();
	}
	 

	public void saveScholasticGradeResultDetails(ScholasticGradeResultDetails scholasticGradeResult) {
		scholasticGradeResultRepository.save(scholasticGradeResult);
	}

	@Transactional
	public void removeScholasticGradeResultDetails(int id) {
	      scholasticGradeResultRepository.deleteById(id);
	}

}

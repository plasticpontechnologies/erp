package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.CoscholasticGradeResultDetails;
import com.plasticon.erp.repository.CoscholasticGradeResultRepository;



@Service
public class CoscholasticGradeResultService {

	@Autowired
	CoscholasticGradeResultRepository coscholasticGradeResultRepository;
		
		public List<CoscholasticGradeResultDetails> getCoscholasticGradeResultDetails() {
			return coscholasticGradeResultRepository.findAll();
		}
		 

		public void saveCoscholasticGradeResultDetails(CoscholasticGradeResultDetails coscholasticGradeResult) {
			coscholasticGradeResultRepository.save(coscholasticGradeResult);
		}

		@Transactional
		public void removeCoscholasticGradeResultDetails(int id) {
		      coscholasticGradeResultRepository.deleteById(id);
		}
	
}

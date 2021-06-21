package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ScholasticGradeCreateDetails;
import com.plasticon.erp.repository.ScholasticGradeCreateRepository;


@Service
public class ScholasticGradeCreateService {
  
	@Autowired
	 ScholasticGradeCreateRepository scholasticGradeCreateRepository;
		
		public List<ScholasticGradeCreateDetails> getScholasticGradeCreateDetails() {
			return scholasticGradeCreateRepository.findAll();
		}
		 

		public void saveScholasticGradeCreateDetails(ScholasticGradeCreateDetails scholasticGradeCreate) {
			scholasticGradeCreateRepository.save(scholasticGradeCreate);
		}

		@Transactional
		public void removeScholasticGradeCreateDetails(int id) {
		      scholasticGradeCreateRepository.deleteById(id);
		}


		
}

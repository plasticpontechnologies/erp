package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.CoscholasticGradeCreateDetails;
import com.plasticon.erp.repository.CoscholasticGradeCreateRepository;


@Service
public class CoscholasticGradeCreateService {
	
	@Autowired
	 CoscholasticGradeCreateRepository coscholasticGradeCreateRepository;
		
		public List<CoscholasticGradeCreateDetails> getCoscholasticGradeCreateDetails() {
			return coscholasticGradeCreateRepository.findAll();
		}
		 

		public void saveCoscholasticGradeCreateDetails(CoscholasticGradeCreateDetails coscholasticGradeCreate) {
			coscholasticGradeCreateRepository.save(coscholasticGradeCreate);
		}

		@Transactional
		public void removeCoscholasticGradeCreateDetails(int id) {
		      coscholasticGradeCreateRepository.deleteById(id);
		}

}

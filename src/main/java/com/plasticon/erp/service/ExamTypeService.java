package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ExamTypeDetails;
import com.plasticon.erp.repository.ExamTypeRepository;



@Service
public class ExamTypeService {
	
	@Autowired
    ExamTypeRepository examTypeRepository;
	
	public List<ExamTypeDetails> getExamTypeDetails() {
		return examTypeRepository.findAll();
	}
	 

	public void saveExamTypeDetails(ExamTypeDetails examType) {
		examTypeRepository.save(examType);
	}

	@Transactional
	public void removeExamTypeDetails(int id) {
	      examTypeRepository.deleteById(id);
	}

}

package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ExamSchedulesDetails;
import com.plasticon.erp.repository.ExamSchedulesRepository;


@Service
public class ExamSchedulesService {

	@Autowired
	ExamSchedulesRepository examSchedulesRepository;
	
	public List<ExamSchedulesDetails> getExamSchedulesDetails() {
		return examSchedulesRepository.findAll();
	}
	 

	public void saveExamSchedulesDetails(ExamSchedulesDetails examschedules) {
		examSchedulesRepository.save(examschedules);
	}

	@Transactional
	public void removeExamSchedulesDetails(int id) {
	      examSchedulesRepository.deleteById(id);
	}
}

package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.plasticon.erp.model.SurveyReport;
import com.plasticon.erp.repository.SurveyReportRepository;

@Service
public class SurveyReportService {

	@Autowired
	SurveyReportRepository surveyreportRepository;
	
	public List<SurveyReport> getSurveyReport() {
		return surveyreportRepository.findAll();

	}

	public void saveSurveyReport(SurveyReport survey) {
		surveyreportRepository.save(survey);
		

	}
	@Transactional
	public void removeSurveyReport(int id) {
		surveyreportRepository.deleteById(id);
	}

}

package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SectionDetails;
import com.plasticon.erp.model.Selection;
import com.plasticon.erp.model.SurveyInformation;
import com.plasticon.erp.repository.SectionRepository;
import com.plasticon.erp.repository.SurveyRepository;

@Service
public class SurveyService {

	@Autowired
	SurveyRepository surveyRepository;
	
	public List<SurveyInformation> getSurveyInformationDetails() {
		
		return surveyRepository.findAll();

	}

	public void saveSurveyInformationDetails(SurveyInformation survey) {
		surveyRepository.save(survey);
	}

	@Transactional
	public void removeSurveyInformationDetails(int id) {
		surveyRepository.deleteById(id);
	}
	
}

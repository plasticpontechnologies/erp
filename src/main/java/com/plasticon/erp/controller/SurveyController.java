package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.SectionDetails;
import com.plasticon.erp.model.SurveyInformation;
import com.plasticon.erp.service.SurveyService;

@RestController
@RequestMapping("/survey")
public class SurveyController {

	@Autowired
	SurveyService surveyService;
	
	
	@RequestMapping(value = "/getSurveyDetails", method = RequestMethod.GET)
	public List<SurveyInformation>  getSurveyInformationData() {
		return surveyService.getSurveyInformationDetails();

	}
	
	  @PostMapping(value = "/saveSurveyDetails", consumes = "application/json")
		public void saveSectionDetails(@RequestBody SurveyInformation survey) {
		  surveyService.saveSurveyInformationDetails(survey);

		}
		
		  @DeleteMapping(value ="/removeSurveyDetails/{id}")
		    public void removeSectionDetails(@PathVariable("id")int Id){
			  surveyService.removeSurveyInformationDetails(Id);
		    }
}



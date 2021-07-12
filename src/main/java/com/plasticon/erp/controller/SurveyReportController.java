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

import com.plasticon.erp.model.SurveyReport;
import com.plasticon.erp.service.SurveyReportService;

@RestController
@RequestMapping("/survey")
public class SurveyReportController {

	
	@Autowired
	SurveyReportService surveyreportService;
	
	@RequestMapping(value = "/getSurveyReport", method = RequestMethod.GET)
	public List<SurveyReport>  getSurveyReportData() {
		return surveyreportService.getSurveyReport();

	}
	
	  @PostMapping(value = "/saveSurveyReport", consumes = "application/json")
		public void saveSurveyReport(@RequestBody SurveyReport survey) {
		  surveyreportService.saveSurveyReport(survey);

		}
		

		  @DeleteMapping(value ="/removeSurveyReport/{id}")
		    public void removeSurveyReport(@PathVariable("id")int Id){
			  surveyreportService.removeSurveyReport(Id);
		    }

}

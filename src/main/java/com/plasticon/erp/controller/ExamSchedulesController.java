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

import com.plasticon.erp.model.ExamSchedulesDetails;
import com.plasticon.erp.model.ExamTypeDetails;
import com.plasticon.erp.service.ExamSchedulesService;
import com.plasticon.erp.service.ExamTypeService;

@RestController
@RequestMapping("/ES")
public class ExamSchedulesController {

	@Autowired
	ExamSchedulesService examSchedulesService;
		
		@RequestMapping(value ="/getExamSchedulesDetails" , method = RequestMethod.GET)
		public List<ExamSchedulesDetails>  getExamSchedulesData() {
			return examSchedulesService.getExamSchedulesDetails();
	}
		
		@PostMapping(value = "/saveExamSchedulesDetails", consumes = "application/json")
		public void saveExamSchedulesDetails(@RequestBody ExamSchedulesDetails examschedules) {
			examSchedulesService.saveExamSchedulesDetails(examschedules);

		}
		

	  @DeleteMapping(value ="/removeExamSchedulesDetails/{id}")
	    public void removeExamSchedulesDetails(@PathVariable("id")int Id){
		  examSchedulesService.removeExamSchedulesDetails(Id);
	    }
}

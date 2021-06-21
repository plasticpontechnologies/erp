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

import com.plasticon.erp.model.ElectiveSubject;
import com.plasticon.erp.model.IssueReport;
import com.plasticon.erp.service.ElectiveSubjectService;

@RestController
@RequestMapping("/elective")
public class ElectiveSubjectController {

	@Autowired
	ElectiveSubjectService electivesubjectService;
	
	@RequestMapping(value = "/getElectiveSubjectDetails", method = RequestMethod.GET)
	public List<ElectiveSubject>  getElectiveSubjectData() {
		return electivesubjectService.getElectiveSubject();

	}
	
	  @PostMapping(value = "/saveElectiveSubjectDetails", consumes = "application/json")
		public void saveElectiveSubject(@RequestBody ElectiveSubject report) {
		  electivesubjectService.saveElectiveSubject(report);

		}
		

		  @DeleteMapping(value ="/removElectiveSubject/{id}")
		    public void removeElectiveSubject(@PathVariable("id")int Id){
			  electivesubjectService.removeElectiveSubject(Id);
		    }

}

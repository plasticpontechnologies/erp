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

import com.plasticon.erp.model.ClassDetails;
import com.plasticon.erp.model.SubjectDetails;
import com.plasticon.erp.service.ClassService;
import com.plasticon.erp.service.SubjectService;

@RestController
@RequestMapping("/sub")
public class SubjectController {
	@Autowired
	SubjectService subjectService;

	@RequestMapping(value = "/getSubjectDetails", method = RequestMethod.GET)
	public List<SubjectDetails>  getSubjectData() {
		return subjectService.getSubjectDetails();

	}
	
	  @PostMapping(value = "/saveSubjectDetails", consumes = "application/json")
		public void saveSubjectDetails(@RequestBody SubjectDetails sub) {
			subjectService.saveSubjectDetails(sub);

		}
		

		  @DeleteMapping(value ="/removeSubjectDetails/{id}")
		    public void removeSubjectDetails(@PathVariable("id")int Id){
			  subjectService.removeSubjectDetails(Id);
		    }

}

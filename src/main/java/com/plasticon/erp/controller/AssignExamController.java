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

import com.plasticon.erp.model.AssignExam;
import com.plasticon.erp.service.AssignExamService;

@RestController
@RequestMapping("/onlineexam")
public class AssignExamController {
	
	@Autowired
	AssignExamService assignExamService;
	@RequestMapping(value = "/getassigntostudent", method = RequestMethod.GET)
	public List<AssignExam> getAssignExam() {
		return assignExamService.getAssignExam();
		
	}
	
	@PostMapping(value = "/saveAssignExam", consumes = "application/json")
	public void saveAssignExam(@RequestBody AssignExam assignexam) {
		assignExamService.saveAssignExam(assignexam);

	}
	
	@DeleteMapping(value = "/removeassign/{id}")
	public void removeAssignExam(@PathVariable("id")int Id){
		assignExamService.removeAssignExam(Id);
	    }
	
}

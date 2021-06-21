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

import com.plasticon.erp.model.StudentFeePenalty;
import com.plasticon.erp.service.StudentFeePenaltyService;

@RestController
@RequestMapping("/ManagePenalty")
public class StudentFeePenaltyController {
	
		
	@Autowired
		StudentFeePenaltyService studentFeePenaltyService;

		@RequestMapping(value = "/getStudentFeePenalty", method = RequestMethod.GET)
		public List<StudentFeePenalty>  getStudentFeePenaltyData() {
			return studentFeePenaltyService.getStudentFeePenalty();

		}
		
		  @PostMapping(value = "/saveStudentFeePenalty", consumes = "application/json")
			public void saveStudentFeePenalty(@RequestBody StudentFeePenalty ManagePenalty) {
				studentFeePenaltyService.saveStudentFeePenalty(ManagePenalty);

			}
			

		  @DeleteMapping(value ="/removeStudentFeePenalty/{id}")
		    public void removeStudentFeePenalty(@PathVariable("id")int Id){
			  studentFeePenaltyService.removeStudentFeePenalty(Id);
		    
		    }


}

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

import com.plasticon.erp.model.ExamTypeDetails;
import com.plasticon.erp.service.ExamTypeService;



@RestController
@RequestMapping("/examtype")
public class ExamTypeController {
	@Autowired
     ExamTypeService examTypeService;
	
	@RequestMapping(value ="/getExamTypeDetails" , method = RequestMethod.GET)
	public List<ExamTypeDetails>  getExamTypeData() {
		return examTypeService.getExamTypeDetails();
}
	
	@PostMapping(value = "/saveExamTypeDetails", consumes = "application/json")
	public void saveExamTypeDetails(@RequestBody ExamTypeDetails examType) {
		examTypeService.saveExamTypeDetails(examType);

	}
	

  @DeleteMapping(value ="/removeExamTypeDetails/{id}")
    public void removeExamTypeDetails(@PathVariable("id")int Id){
	  examTypeService.removeExamTypeDetails(Id);
    }

}

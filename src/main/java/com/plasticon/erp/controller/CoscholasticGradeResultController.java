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

import com.plasticon.erp.model.CoscholasticGradeResultDetails;
import com.plasticon.erp.service.CoscholasticGradeResultService;



@RestController
@RequestMapping("/CSGR")
public class CoscholasticGradeResultController {

	@Autowired
	CoscholasticGradeResultService coscholasticGradeResultService;
		
	@RequestMapping(value ="/getCoscholasticGradeCreateDetails" , method = RequestMethod.GET)
	public List<CoscholasticGradeResultDetails>  getCoscholasticGradeCreateData() {
		return coscholasticGradeResultService.getCoscholasticGradeResultDetails();
}
	
	 @PostMapping(value = "/saveCoscholasticGradeResultDetails", consumes = "application/json")
	public void saveCoscholasticGradeResultDetails(@RequestBody CoscholasticGradeResultDetails coscholasticGradeResult) {
		coscholasticGradeResultService.saveCoscholasticGradeResultDetails(coscholasticGradeResult);

	}
	

  @DeleteMapping(value ="/removecoscholasticGradeResultDetails/{id}")
    public void removeCoscholasticGradeResultDetails(@PathVariable("id")int Id){
	  coscholasticGradeResultService.removeCoscholasticGradeResultDetails(Id);
    }
}

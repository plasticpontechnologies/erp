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

import com.plasticon.erp.model.CoscholasticGradeCreateDetails;
import com.plasticon.erp.service.CoscholasticGradeCreateService;



@RestController
@RequestMapping("/CSGC")
public class CoscholasticGradeCreateController {

	@Autowired
     CoscholasticGradeCreateService coscholasticGradeCreateService;
	
	@RequestMapping(value ="/getCoscholasticGradeCreateDetails" , method = RequestMethod.GET)
	public List<CoscholasticGradeCreateDetails>  getCoscholasticGradeCreateData() {
		return coscholasticGradeCreateService.getCoscholasticGradeCreateDetails();
}
	
	@PostMapping(value = "/saveCoscholasticGradeCreateDetails", consumes = "application/json")
	public void saveCoscholasticGradeCreateDetails(@RequestBody CoscholasticGradeCreateDetails coscholasticGradeCreate) {
		coscholasticGradeCreateService.saveCoscholasticGradeCreateDetails(coscholasticGradeCreate);

	}
	

  @DeleteMapping(value ="/removecoscholasticGradeCreateDetails/{id}")
    public void removeCoscholasticGradeCreateDetails(@PathVariable("id")int Id){
	  coscholasticGradeCreateService.removeCoscholasticGradeCreateDetails(Id);
    }
}

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

import com.plasticon.erp.model.ScholasticGradeCreateDetails;
import com.plasticon.erp.service.ScholasticGradeCreateService;


@RestController
@RequestMapping("/ScholasticGC")
public class ScholasticGradeCreateController {
	
	@Autowired
    ScholasticGradeCreateService scholasticGradeCreateService;
	
	@RequestMapping(value ="/getScholasticGradeCreateDetails" , method = RequestMethod.GET)
	public List<ScholasticGradeCreateDetails>  getScholasticGradeCreateData() {
		return scholasticGradeCreateService.getScholasticGradeCreateDetails();
}
	
	@PostMapping(value = "/saveScholasticGradeCreateDetails", consumes = "application/json")
	public void saveScholasticGradeCreateDetails(@RequestBody ScholasticGradeCreateDetails scholasticGradeCreate) {
		scholasticGradeCreateService.saveScholasticGradeCreateDetails(scholasticGradeCreate);

	}
	

  @DeleteMapping(value ="/removeScholasticGradeCreateDetails/{id}")
    public void removeScholasticGradeCreateDetails(@PathVariable("id")int Id){
	  scholasticGradeCreateService.removeScholasticGradeCreateDetails(Id);
    }

}

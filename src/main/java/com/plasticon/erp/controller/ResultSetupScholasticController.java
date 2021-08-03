package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.ResultSetupScholasticDetails;

import com.plasticon.erp.service.ResultSetupScholasticService;


@RestController
@RequestMapping("/resultSetupscholastic")
public class ResultSetupScholasticController {

	@Autowired
     ResultSetupScholasticService resultSetupScholasticService;
	
	@RequestMapping(value ="/getResultSetupScholasticDetails" , method = RequestMethod.GET)
	public List<ResultSetupScholasticDetails>  getResultSetupScholasticData() {
		return resultSetupScholasticService.getResultSetupScholasticDetails();
}
	
	@PostMapping(value = "/saveResultSetupScholasticDetails", consumes = "application/json")
	public void saveResultSetupScholasticDetails(@RequestBody ResultSetupScholasticDetails resultsetupscholastic) {
		resultSetupScholasticService.saveResultSetupScholasticDetails(resultsetupscholastic);

	}
	

  @DeleteMapping(value ="/removeResultSetupScholasticDetails/{id}")
    public void removeResultSetupScholasticDetails(@PathVariable("id")int Id){
	  resultSetupScholasticService.removeResultSetupScholasticDetails(Id);
    }
  
  
	
}

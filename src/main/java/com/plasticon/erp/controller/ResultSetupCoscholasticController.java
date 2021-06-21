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

import com.plasticon.erp.model.ResultSetupCoscholasticDetails;
import com.plasticon.erp.service.ResultSetupCoscholasticService;


@RestController
@RequestMapping("/RSCS")
public class ResultSetupCoscholasticController {
	
	@Autowired
	ResultSetupCoscholasticService resultSetupCoscholasticService;
		
		@RequestMapping(value ="/getResultSetupCoscholasticDetails" , method = RequestMethod.GET)
		public List<ResultSetupCoscholasticDetails>  getResultSetupCoscholasticData() {
			return resultSetupCoscholasticService.getResultSetupCoscholasticDetails();
	}
		
		@PostMapping(value = "/saveResultSetupCoscholasticDetails", consumes = "application/json")
		public void saveResultSetupCoscholasticDetails(@RequestBody ResultSetupCoscholasticDetails resultsetupCoscholastic) {
			resultSetupCoscholasticService.saveResultSetupCoscholasticDetails(resultsetupCoscholastic);

		}
		

	  @DeleteMapping(value ="/removeResultSetupCoscholasticDetails/{id}")
	    public void removeResultSetupCoscholasticDetails(@PathVariable("id")int Id){
		  resultSetupCoscholasticService.removeResultSetupCoscholasticDetails(Id);
	    }

}

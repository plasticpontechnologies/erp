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

import com.plasticon.erp.model.SetupExamTermsDetails;
import com.plasticon.erp.service.SetupExamTermsService;



@RestController
@RequestMapping("/setupexamterms")
public class SetupExamTermsController {
	
	@Autowired 
    SetupExamTermsService setupExamTermsService;
	
	@RequestMapping(value ="/getSetupExamTermsDetails" , method = RequestMethod.GET)
	public List<SetupExamTermsDetails>  getSetupExamTermsData() {
		return setupExamTermsService.getSetupExamTermsDetails();
}
	
	@PostMapping(value = "/saveSetupExamTermsDetails", consumes = "application/json")
	public void saveSetupExamTermsDetails(@RequestBody SetupExamTermsDetails setupExamTerms) {
		setupExamTermsService.saveSetupExamTermsDetails(setupExamTerms);

	}
	

  @DeleteMapping(value ="/removeSetupExamTermsDetails/{id}")
    public void removeSetupExamTermsDetails(@PathVariable("id")int Id){
	  setupExamTermsService.removeSetupExamTermsDetails(Id);
    }

}

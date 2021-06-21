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

import com.plasticon.erp.model.SetupTermsDateDetails;
import com.plasticon.erp.service.SetupTermsDateService;


@RestController
@RequestMapping("/setuptermsdate")
public class SetupTermsDateController {
  
	@Autowired
	 SetupTermsDateService setupTermsDateService;
		
		@RequestMapping(value ="getSetupTermsDateDetails" , method = RequestMethod.GET)
		public List<SetupTermsDateDetails>  getSetupTermsDateData() {
			return setupTermsDateService.getSetupTermsDateDetails();
	}
		
		@PostMapping(value = "/saveSetupTermsDateDetails", consumes = "application/json")
		public void saveSetupTermsDateDetails(@RequestBody SetupTermsDateDetails setupTermsDate) {
			setupTermsDateService.saveSetupTermsDateDetails(setupTermsDate);

		}
		

	  @DeleteMapping(value ="/removeSetupTermsDateDetails/{id}")
	    public void removeSetupTermsDateDetails(@PathVariable("id")int Id){
		  setupTermsDateService.removeSetupTermsDateDetails(Id);
	    }
}

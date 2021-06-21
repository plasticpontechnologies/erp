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

import com.plasticon.erp.model.SetupMarkSheetDetails;
import com.plasticon.erp.service.SetupMarkSheetService;



@RestController
@RequestMapping("/setupmarksheet")
public class SetupMarkSheetController {
	
	@Autowired
	 SetupMarkSheetService setupMarkSheetService;
		
		@RequestMapping(value ="/getSetupMarkSheetDetails" , method = RequestMethod.GET)
		public List<SetupMarkSheetDetails>  getSetupMarkSheetData() {
			return setupMarkSheetService.getSetupMarkSheetDetails();
	}
		
		@PostMapping(value = "/saveSetupMarkSheetDetails", consumes = "application/json")
		public void saveSetupMarkSheetDetails(@RequestBody SetupMarkSheetDetails setupMarkSheet) {
			setupMarkSheetService.saveSetupmarkSheetDetails(setupMarkSheet);

		}
		

	  @DeleteMapping(value ="/removeSetupMarkSheetDetails/{id}")
	    public void removeSetupMarkSheetDetails(@PathVariable("id")int Id){
		  setupMarkSheetService.removeSetupMarkSheetDetails(Id);
	    }

}

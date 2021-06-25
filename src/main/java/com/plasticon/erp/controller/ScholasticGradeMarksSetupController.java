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

import com.plasticon.erp.model.ScholasticGradeMarksSetupDetails;
import com.plasticon.erp.service.ScholasticGradeMarksSetupService;

@RestController
@RequestMapping("/SGMSS")
public class ScholasticGradeMarksSetupController {
	
	@Autowired
   ScholasticGradeMarksSetupService scholasticGradeMarksSetupService;
	
	@RequestMapping(value ="/getScholasticGradeMarksSetupDetails" , method = RequestMethod.GET)
	public List<ScholasticGradeMarksSetupDetails>  getScholasticGradeMarksSetupData() {
		return scholasticGradeMarksSetupService.getScholasticGradeMarksSetupDetails();
}
	
	@PostMapping(value = "/saveScholasticGradeMarksSetupDetails", consumes = "application/json")
	public void saveScholasticGradeMarksSetupDetails(@RequestBody ScholasticGradeMarksSetupDetails scholasticGradeMarksSetup) {
		scholasticGradeMarksSetupService.saveScholasticGradeMarksSetupDetails(scholasticGradeMarksSetup);

	}
	

  @DeleteMapping(value ="/removeScholasticGradeMarksSetupDetails/{id}")
    public void removeScholasticGradeMarksSetupDetails(@PathVariable("id")int Id){
	  scholasticGradeMarksSetupService.removeScholasticGradeMarksSetupDetails(Id);
    }

}

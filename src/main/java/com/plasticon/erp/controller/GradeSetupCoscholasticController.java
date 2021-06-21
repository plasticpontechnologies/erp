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

import com.plasticon.erp.model.GradeSetupCoscholasticDetails;
import com.plasticon.erp.service.GradeSetupCoscholasticService;



@RestController
@RequestMapping("/GSUCS")
public class GradeSetupCoscholasticController {

	@Autowired
	GradeSetupCoscholasticService gradeSetupCoscholasticService;

	@RequestMapping(value = "/getGradeSetupCoscholasticDetails", method = RequestMethod.GET)
	public List<GradeSetupCoscholasticDetails>  getGradeSetupCoscholasticData() {
		return gradeSetupCoscholasticService.getGradeSetupCoscholasticDetails();

	}
	
	  @PostMapping(value = "/saveGradeSetupCoscholasticDetails", consumes = "application/json")
		public void saveGradeSetupCoscholasticDetails(@RequestBody GradeSetupCoscholasticDetails gradeSetupCoscholastic) {
			gradeSetupCoscholasticService.saveGradeSetupCoscholasticDetails(gradeSetupCoscholastic);

		}
		

	  @DeleteMapping(value ="/removeGradeSetupCoscholasticDetails/{id}")
	    public void removeGradeSetupCoscholasticDetails(@PathVariable("id")int Id){
		  gradeSetupCoscholasticService.removeGradeSetupCoscholasticDetails(Id);
	    }
	  
}

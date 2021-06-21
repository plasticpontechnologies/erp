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
import com.plasticon.erp.model.ScholasticGradeResultDetails;
import com.plasticon.erp.service.ScholasticGradeMarksSetupService;
import com.plasticon.erp.service.ScholasticGradeResultService;

@RestController
@RequestMapping("/SGR")
public class ScholasticGradeResultController {

	@Autowired
	ScholasticGradeResultService scholasticGradeResultService;
	
	@RequestMapping(value ="/getScholasticGradeResultDetails" , method = RequestMethod.GET)
	public List<ScholasticGradeResultDetails>  getScholasticGradeResultData() {
		return scholasticGradeResultService.getScholasticGradeResultDetails();
}
	
	@PostMapping(value = "/saveScholasticGradeResultDetails", consumes = "application/json")
	public void saveScholasticGradeResultDetails(@RequestBody ScholasticGradeResultDetails scholasticGradeResult) {
		scholasticGradeResultService.saveScholasticGradeResultDetails(scholasticGradeResult);

	}
	

  @DeleteMapping(value ="/removeScholasticGradeResultDetails/{id}")
    public void removeScholasticGradeResultDetails(@PathVariable("id")int Id){
	  scholasticGradeResultService.removeScholasticGradeResultDetails(Id);
    }

}

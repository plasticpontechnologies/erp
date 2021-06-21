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

import com.plasticon.erp.model.MarksSetupScholasticDetails;
import com.plasticon.erp.model.MenuDetails;
import com.plasticon.erp.service.MarksSetupScholasticService;
import com.plasticon.erp.service.MenuService;

@RestController
@RequestMapping("/markssetupscholastic")
public class MarksSetupScholasticController {
	
	@Autowired
	MarksSetupScholasticService marksSetupScholasticService;

	@RequestMapping(value = "/getMarksSetupScholasticDetails", method = RequestMethod.GET)
	public List<MarksSetupScholasticDetails>  getMarksSetupScholasticData() {
		return marksSetupScholasticService.getMarksSetupScholasticDetails();

	}
	
	  @PostMapping(value = "/saveMarksSetupScholasticDetails", consumes = "application/json")
		public void saveMarksSetupScholasticDetails(@RequestBody MarksSetupScholasticDetails mss) {
			marksSetupScholasticService.saveMarksSetupScholasticDetails(mss);

		}
		

		  @DeleteMapping(value ="/removeMarksSetupScholasticDetails/{id}")
		    public void removeMarksSetupScholasticDetails(@PathVariable("id")int Id){
			  marksSetupScholasticService.removeMarksSetupScholasticDetails(Id);
		    }

}

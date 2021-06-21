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

import com.plasticon.erp.model.PositionDetails;
import com.plasticon.erp.model.StaffDetails;
import com.plasticon.erp.service.PositionService;
import com.plasticon.erp.service.StaffService;

@RestController
@RequestMapping("/p")
public class PositionController {
	@Autowired
	PositionService positionService;

	@RequestMapping(value = "/getPositionDetails", method = RequestMethod.GET)
	public List<PositionDetails>  getPositionData() {
		return positionService.getPositonDetails();

	}
	
	  @PostMapping(value = "/savePositionDetails", consumes = "application/json")
		public void savePositionDetails(@RequestBody PositionDetails p) {
			positionService.savePositionDetails(p);

		}
		

	  @DeleteMapping(value ="/removePositionDetails/{id}")
	    public void removePositionDetails(@PathVariable("id")int Id){
		  positionService.removePositionDetails(Id);
	    }
}

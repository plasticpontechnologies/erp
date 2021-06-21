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

import com.plasticon.erp.model.CanteenMasterEntry;
import com.plasticon.erp.model.SubjectDetails;
import com.plasticon.erp.service.CanteenService;
import com.plasticon.erp.service.SubjectService;

@RestController
@RequestMapping("/canteen")
public class CanteenController {
	@Autowired
	CanteenService canteenService;

	@RequestMapping(value = "/getCanteenMasterEntry", method = RequestMethod.GET)
	public List<CanteenMasterEntry>  getCanteenData() {
		return canteenService.getCanteenMasterEntry();

	}
	
	  @PostMapping(value = "/saveCanteenMasterEntry", consumes = "application/json")
		public void saveCanteenMasterEntry(@RequestBody CanteenMasterEntry canteen) {
			canteenService.saveCanteenMasterEntry(canteen);

		}
		

		  @DeleteMapping(value ="/removeCanteenMasterEntry/{id}")
		    public void removeCanteenMasterEntry(@PathVariable("id")int Id){
			  canteenService.removeCanteenMasterEntry(Id);
		    }

	
	

}

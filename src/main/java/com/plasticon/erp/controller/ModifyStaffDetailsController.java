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

import com.plasticon.erp.model.ModifyStaffDetails;
import com.plasticon.erp.service.ModifyStaffDetailsService;

@RestController
@RequestMapping("/modifystaffDetails")
public class ModifyStaffDetailsController {

	
	@Autowired
	ModifyStaffDetailsService modifyStaffDetailsService;

	@RequestMapping(value = "/getModifyStaffDetails", method = RequestMethod.GET)
	public List<ModifyStaffDetails>  getModifyStaffDetailsData() {
		return modifyStaffDetailsService.getModifyStaffDetails();

	}
	
	  @PostMapping(value = "/saveModifyStaffDetails", consumes = "application/json")
		public void saveModifyStaffDetails(@RequestBody ModifyStaffDetails modifystaff) {
			modifyStaffDetailsService.saveModifyStaffDetails(modifystaff);

		}
		

	  @DeleteMapping(value ="/removeModifyStaffDetails/{id}")
	    public void removeModifyStaffDetails(@PathVariable("id")int Id){
		  modifyStaffDetailsService.removeModifyStaffDetails(Id);
	    }
}

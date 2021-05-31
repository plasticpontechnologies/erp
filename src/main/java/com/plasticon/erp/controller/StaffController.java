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

import com.plasticon.erp.model.StaffDetails;
import com.plasticon.erp.service.StaffService;



@RestController
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	StaffService staffService;

	@RequestMapping(value = "/getStaffDetails", method = RequestMethod.GET)
	public List<StaffDetails>  getStaffData() {
		return staffService.getStaffDetails();

	}
	
	  @PostMapping(value = "/saveStaffDetails", consumes = "application/json")
		public void saveStaffDetails(@RequestBody StaffDetails staff) {
			staffService.saveStaffDetails(staff);

		}
		

	  @DeleteMapping(value ="/removeStaffDetails/{fullname}")
	    public void removeStaffDetails(@PathVariable("fullname")StaffDetails fullName){
		  System.out.println("git test");
		  staffService.removeStaffDetails(fullName);
		  
	    }
	  
}

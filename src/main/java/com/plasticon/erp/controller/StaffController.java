package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.StaffDetails;
import com.plasticon.erp.model.SubjectDetails;
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
		

	  @DeleteMapping(value ="/removeStaffDetails/{id}")
	    public void removeStaffDetails(@PathVariable("id")int Id){
		  staffService.removeStaffDetails(Id);
	    }
	  
	  @GetMapping(value="/getStaffDetailsInUser")
		public List<StaffDetails> getStaffData1() {
			return staffService.findByStaffDetails();
		}

	  
}

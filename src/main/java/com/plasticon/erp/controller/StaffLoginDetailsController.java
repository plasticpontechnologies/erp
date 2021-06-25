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

import com.plasticon.erp.model.SendSmsToOthers;
import com.plasticon.erp.model.StaffLoginDetails;
import com.plasticon.erp.service.StaffLoginDetailsService;

@RestController
@RequestMapping("/stafflog")
public class StaffLoginDetailsController {

	@Autowired
	public StaffLoginDetailsService stafflogindetailsService;
	
	
	@RequestMapping(value = "/getStaffLoginDetails", method = RequestMethod.GET)
	public List<StaffLoginDetails>  getStaffLoginDetailsData() {
		return stafflogindetailsService.getStaffLoginDetails();

	}
	
	  @PostMapping(value = "/saveStaffLoginDetails", consumes = "application/json")
		public void saveStaffLoginDetails(@RequestBody StaffLoginDetails stafflog) {
		  stafflogindetailsService.saveStaffLoginDetails(stafflog);

		}
		
		  @DeleteMapping(value ="/removeStaffLoginDetails/{id}")
		    public void removeStaffLoginDetails(@PathVariable("id")int Id){
			  stafflogindetailsService.removeStaffLoginDetails(Id);
		    }
}

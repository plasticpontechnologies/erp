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

import com.plasticon.erp.model.StaffEarlyLeave;
import com.plasticon.erp.model.StaffWorkingHour;
import com.plasticon.erp.service.StaffEarlyLeaveService;
import com.plasticon.erp.service.StaffWorkingHourService;

@RestController
@RequestMapping("/attendance")
public class StaffEarlyLeaveController {
	@Autowired
	StaffEarlyLeaveService staffEarlyLeaveService;

	@RequestMapping(value = "/getStaffEarlyLeave", method = RequestMethod.GET)
	public List<StaffEarlyLeave>  getStaffEarlyData() {
		return staffEarlyLeaveService.getStaffEarlyLeave();

	}
	
	  @PostMapping(value = "/saveStaffEarlyLeave", consumes = "application/json")
		public void saveStaffEarlyLeave(@RequestBody StaffEarlyLeave attendance) {
			staffEarlyLeaveService.saveStaffEarlyLeave(attendance);

		}
		

	  @DeleteMapping(value ="/removeStaffEarlyLeave/{id}")
	    public void removeStaffEarlyLeave(@PathVariable("id")int Id){
		  staffEarlyLeaveService.removeStaffEarlyLeave(Id);
	    }

	

}

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
import com.plasticon.erp.model.StaffLateArrival;
import com.plasticon.erp.service.StaffEarlyLeaveService;
import com.plasticon.erp.service.StaffLateArrivalService;
@RestController
@RequestMapping("/attendance")
public class StaffLateArrivalController {
	
		@Autowired
		StaffLateArrivalService staffLateArrivalService;

		@RequestMapping(value = "/getStaffLateArrival", method = RequestMethod.GET)
		public List<StaffLateArrival>  getStaffLateData() {
			return staffLateArrivalService.getStaffLateArrival();

		}
		
		  @PostMapping(value = "/saveStaffLateArrival", consumes = "application/json")
			public void saveStaffLateArrival(@RequestBody StaffLateArrival attendance) {
				staffLateArrivalService.saveStaffLateArrival(attendance);

			}
			

		  @DeleteMapping(value ="/removeStaffLateArrival/{id}")
		    public void removeStaffLateArrival(@PathVariable("id")int Id){
			  staffLateArrivalService.removeStaffLateArrival(Id);
		    }

}

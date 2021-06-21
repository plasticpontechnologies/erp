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

import com.plasticon.erp.model.StaffAttendance;

import com.plasticon.erp.service.StaffAttendanceService;


@RestController
@RequestMapping("/attendance")
public class StaffAttendanceController {
	@Autowired
	StaffAttendanceService staffAttendanceService;

	@RequestMapping(value = "/getStaffAttendance", method = RequestMethod.GET)
	public List<StaffAttendance>  getStaffData() {
		return staffAttendanceService.getStaffAttendance();

	}
	
	  @PostMapping(value = "/saveStaffAttendance", consumes = "application/json")
		public void saveStaffAttendance(@RequestBody StaffAttendance attendance) {
			staffAttendanceService.saveStaffAttendance(attendance);

		}
		

	  @DeleteMapping(value ="/removeStaffAttendance/{id}")
	    public void removeStaffAttendance(@PathVariable("id")int Id){
		  staffAttendanceService.removeStaffAttendance(Id);
	    }

}

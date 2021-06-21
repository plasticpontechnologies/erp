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

import com.plasticon.erp.model.DisplayStaffAttendance;

import com.plasticon.erp.service.DisplayStaffAttendanceService;

@RestController
@RequestMapping("/attendance")
public class DisplayStaffAttendanceController {
	
			@Autowired
			DisplayStaffAttendanceService displayStaffAttendanceService;

			@RequestMapping(value = "/getDisplayStaffAttendance", method = RequestMethod.GET)
			public List<DisplayStaffAttendance>  getDisplayStaffData() {
				return displayStaffAttendanceService.getDisplayStaffAttendance();

			}
			
			  @PostMapping(value = "/saveDisplayStaffAttendance", consumes = "application/json")
				public void saveDisplayStaffAttendance(@RequestBody DisplayStaffAttendance attendance) {
				  displayStaffAttendanceService.saveDisplayStaffAttendance(attendance);

				}
				

			  @DeleteMapping(value ="/removeDisplayStaffAttendance/{id}")
			    public void removeDisplayStaffAttendance(@PathVariable("id")int Id){
				  displayStaffAttendanceService.removeDisplayStaffAttendance(Id);
			    }

}

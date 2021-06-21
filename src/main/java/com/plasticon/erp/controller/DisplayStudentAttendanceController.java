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

import com.plasticon.erp.model.DisplayStudentAttendance;
import com.plasticon.erp.service.DisplayStudentAttendanceService;

@RestController
@RequestMapping("/attendance")
public class DisplayStudentAttendanceController {
	
		@Autowired
		DisplayStudentAttendanceService displayStudentAttendanceService;

		@RequestMapping(value = "/getDisplayStudentAttendance", method = RequestMethod.GET)
		public List<DisplayStudentAttendance>  getDisplayStudentData() {
			return displayStudentAttendanceService.getDisplayStudentAttendance();

		}
		
		  @PostMapping(value = "/saveDisplayStudentAttendance", consumes = "application/json")
			public void saveDisplayStudentAttendance(@RequestBody DisplayStudentAttendance attendance) {
			  displayStudentAttendanceService.saveDisplayStudentAttendance(attendance);

			}
			

		  @DeleteMapping(value ="/removeDisplayStudentAttendance/{id}")
		    public void removeDisplayStudentAttendance(@PathVariable("id")int Id){
			  displayStudentAttendanceService.removeDisplayStudentAttendance(Id);
		    }

}

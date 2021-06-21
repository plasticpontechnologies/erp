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

import com.plasticon.erp.model.StudentAttendance;
import com.plasticon.erp.model.StudentLateAndEarlyDeparture;
import com.plasticon.erp.service.StudentAttendanceService;
import com.plasticon.erp.service.StudentLateAndEarlyDepartureService;
@RestController
@RequestMapping("/attendance")
public class StudentLateAndEarlyDepartureController {
	
		@Autowired
		StudentLateAndEarlyDepartureService studentLateAndEarlyDepartureService;

		@RequestMapping(value = "/getStudentLateAndEarlyDeparture", method = RequestMethod.GET)
		public List<StudentLateAndEarlyDeparture>  getStudentLateAndEarlyData() {
			return studentLateAndEarlyDepartureService.getStudentLateAndEarlyDeparture();

		}
		
		  @PostMapping(value = "/saveStudentLateAndEarlyDeparture", consumes = "application/json")
			public void saveStudentLateAndEarlyDeparture(@RequestBody StudentLateAndEarlyDeparture attendance) {
			  studentLateAndEarlyDepartureService.saveStudentLateAndEarlyDeparture(attendance);

			}
			

		  @DeleteMapping(value ="/removeStudentLateAndEarlyDeparture/{id}")
		    public void removeStudentLateAndEarlyDeparture(@PathVariable("id")int Id){
			  studentLateAndEarlyDepartureService.removeStudentLateAndEarlyDeparture(Id);
		    }

}

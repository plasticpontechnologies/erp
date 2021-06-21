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

import com.plasticon.erp.service.StudentAttendanceService;

@RestController
@RequestMapping("/attendance")
public class StudentAttendanceController {
	@Autowired
	StudentAttendanceService studentAttendanceService;

	@RequestMapping(value = "/getStudentAttendance", method = RequestMethod.GET)
	public List<StudentAttendance>  getStudentData() {
		return studentAttendanceService.getStudentAttendance();

	}
	
	  @PostMapping(value = "/saveStudentAttendance", consumes = "application/json")
		public void saveStudentAttendance(@RequestBody StudentAttendance attendance) {
		  studentAttendanceService.saveStudentAttendance(attendance);

		}
		

	  @DeleteMapping(value ="/removeStudentAttendance/{id}")
	    public void removeStudentAttendance(@PathVariable("id")int Id){
		  studentAttendanceService.removeStudentAttendance(Id);
	    }

}

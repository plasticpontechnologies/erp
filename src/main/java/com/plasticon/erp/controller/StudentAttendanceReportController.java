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


import com.plasticon.erp.model.StudentAttendanceReport;
import com.plasticon.erp.service.StudentAttendanceReportService;

@RestController
@RequestMapping("/attendance")
public class StudentAttendanceReportController {
	
		@Autowired
		StudentAttendanceReportService studentAttendanceReportService;

		@RequestMapping(value = "/getStudentAttendanceReport", method = RequestMethod.GET)
		public List<StudentAttendanceReport>  getStudentAttendanceData() {
			return studentAttendanceReportService.getStudentAttendanceReport();

		}
		
		  @PostMapping(value = "/saveStudentAttendanceReport", consumes = "application/json")
			public void saveStudentAttendanceReport(@RequestBody StudentAttendanceReport attendance) {
			  studentAttendanceReportService.saveStudentAttendanceReport(attendance);

			}
			

		  @DeleteMapping(value ="/removeStudentAttendanceReport/{id}")
		    public void removeStudentAttendanceReport(@PathVariable("id")int Id){
			  studentAttendanceReportService.removeStudentAttendanceReport(Id);
		    }


}

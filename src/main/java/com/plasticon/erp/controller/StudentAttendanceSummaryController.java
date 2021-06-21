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

import com.plasticon.erp.model.StudentAttendanceSummary;
import com.plasticon.erp.service.StudentAttendanceSummaryService;



@RestController
@RequestMapping("/attendance")
public class StudentAttendanceSummaryController {
	@Autowired
	StudentAttendanceSummaryService studentAttendanceSummaryService;

	@RequestMapping(value = "/getStudentAttendanceSummary", method = RequestMethod.GET)
	public List<StudentAttendanceSummary>  getStudentAttendanceData() {
		return studentAttendanceSummaryService.getStudentAttendanceSummary();

	}
	
	  @PostMapping(value = "/saveStudentAttendanceSummary", consumes = "application/json")
		public void saveStudentAttendanceSummary(@RequestBody StudentAttendanceSummary attendance) {
		  studentAttendanceSummaryService.saveStudentAttendanceSummary(attendance);

		}
		

	  @DeleteMapping(value ="/removeStudentAttendanceSummary/{id}")
	    public void removeStudentAttendanceSummary(@PathVariable("id")int Id){
		  studentAttendanceSummaryService.removeStudentAttendanceSummary(Id);
	    }

}

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

import com.plasticon.erp.model.StudentSlotAttendanceReport;
import com.plasticon.erp.service.StudentSlotAttendanceReportService;



@RestController
@RequestMapping("/attendance")
public class StudentSlotAttendanceReportController {
	@Autowired
	StudentSlotAttendanceReportService studentSlotAttendanceReportService;

	@RequestMapping(value = "/getStudentSlotAttendanceReport", method = RequestMethod.GET)
	public List<StudentSlotAttendanceReport>  getStudentSlotAttendanceData() {
		return studentSlotAttendanceReportService.getStudentSlotAttendanceReport();

	}
	
	  @PostMapping(value = "/saveStudentSlotAttendanceReport", consumes = "application/json")
		public void saveStudentSlotAttendanceReport(@RequestBody StudentSlotAttendanceReport attendance) {
		  studentSlotAttendanceReportService.saveStudentSlotAttendanceReport(attendance);

		}
		

	  @DeleteMapping(value ="/removeStudentSlotAttendanceReport/{id}")
	    public void removeStudentSlotAttendanceReport(@PathVariable("id")int Id){
		  studentSlotAttendanceReportService.removeStudentSlotAttendanceReport(Id);
	    }


}

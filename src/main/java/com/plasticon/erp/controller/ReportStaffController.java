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

import com.plasticon.erp.model.IssueReportStaff;
import com.plasticon.erp.model.IssueToStaff;
import com.plasticon.erp.service.ReportStaffService;

@RestController
@RequestMapping("/reportstaff")
public class ReportStaffController {

	@Autowired
	public ReportStaffService reportstaffService;
	
	@RequestMapping(value = "/getIssueReportStaff", method = RequestMethod.GET)
	public List<IssueReportStaff>  getIssueReportStaffData() {
		return reportstaffService.getIssueReportStaff();

	}
	
	  @PostMapping(value = "/saveIssueReportStaff", consumes = "application/json")
		public void saveIssueReportStaff(@RequestBody IssueReportStaff reportstaff) {
		  reportstaffService.saveIssueReportStaff(reportstaff);

		}
		
		  @DeleteMapping(value ="/removeIssueReportStaff/{id}")
		    public void removeIssueReportStaff(@PathVariable("id")int Id){
			  reportstaffService.removeIssueReportStaff(Id);
		    }
}

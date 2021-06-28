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

import com.plasticon.erp.model.IssueToStaff;
import com.plasticon.erp.model.StaffLoginDetails;
import com.plasticon.erp.repository.IssueToStaffRepository;
import com.plasticon.erp.service.IssueToStaffService;

@RestController
@RequestMapping("/issuestaff")
public class IssueToStaffController {

	@Autowired
	public IssueToStaffService issuetostaffService;
	
	@RequestMapping(value = "/getIssueToStaff", method = RequestMethod.GET)
	public List<IssueToStaff>  getIssueToStaffData() {
		return issuetostaffService.getIssueToStaff();

	}
	
	  @PostMapping(value = "/saveIssueToStaff", consumes = "application/json")
		public void saveIssueToStaff(@RequestBody IssueToStaff issuestaff) {
		  issuetostaffService.saveIssueToStaff(issuestaff);

		}
		
		  @DeleteMapping(value ="/removeIssueToStaff/{id}")
		    public void removeIssueToStaff(@PathVariable("id")int Id){
			  issuetostaffService.removeIssueToStaff(Id);
		    }
}

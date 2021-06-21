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


import com.plasticon.erp.model.LoginReport;

import com.plasticon.erp.service.LoginReportService;

@RestController
@RequestMapping("/manageuser")
public class LoginReportController {
	@Autowired
	LoginReportService loginReportService;

	@RequestMapping(value = "/getLoginReport", method = RequestMethod.GET)
	public List<LoginReport>  getLoginReportData() {
		return loginReportService.getLoginReport();

	}
	
	  @PostMapping(value = "/saveLoginReport", consumes = "application/json")
		public void saveLoginReport(@RequestBody LoginReport manageuser) {
			loginReportService.saveLoginReport(manageuser);

		}
		

	  @DeleteMapping(value ="/removeLoginreport/{id}")
	    public void removeLoginreport(@PathVariable("id")int Id){
		  loginReportService.removeLoginReport(Id);
	    }


}

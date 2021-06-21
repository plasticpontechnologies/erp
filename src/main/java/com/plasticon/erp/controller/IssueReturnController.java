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

import com.plasticon.erp.model.BarCode;
import com.plasticon.erp.model.IssueReturn;
import com.plasticon.erp.service.IssueReturnService;

@RestController
@RequestMapping("/issue")
public class IssueReturnController {

	@Autowired
	IssueReturnService issuereturnService;
	
	@RequestMapping(value = "/getIssueReturnDetails", method = RequestMethod.GET)
	public List<IssueReturn>  getBarIssueReturnData() {
		return issuereturnService.getIssueReturn();

	}
	
	  @PostMapping(value = "/saveIssueReturnDetails", consumes = "application/json")
		public void saveIssueReturn(@RequestBody IssueReturn issue) {
		  issuereturnService.saveIssueReturn(issue);

		}
		

		  @DeleteMapping(value ="/removIssueReturn/{id}")
		    public void removeIssueReturn(@PathVariable("id")int Id){
			  issuereturnService.removeIssueReturn(Id);
		    }
}

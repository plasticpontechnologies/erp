package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.SendSmsToOthers;
import com.plasticon.erp.model.StudentRoute;
import com.plasticon.erp.model.SubjectDetails;
import com.plasticon.erp.service.OthersService;

@RestController
@RequestMapping("/others")
public class OthersController {

	@Autowired
	public OthersService othersService;
	
	@RequestMapping(value = "/getSendSmsToOthers", method = RequestMethod.GET)
	public List<SendSmsToOthers>  getSendSmsToOthersData() {
		return othersService.getSendSmsToOthers();

	}
	
	  @PostMapping(value = "/saveSendSmsToOthers", consumes = "application/json")
		public void saveSendSmsToOthers(@RequestBody SendSmsToOthers sub) {
		  othersService.saveSendSmsToOthers(sub);

		}
		

		  @DeleteMapping(value ="/removeSendSmsToOthers/{id}")
		    public void removeSendSmsToOthers(@PathVariable("id")int Id){
			  othersService.removeSendSmsToOthers(Id);
		    }
		  }

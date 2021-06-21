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

import com.plasticon.erp.model.BasicInformation;
import com.plasticon.erp.service.BasicInformationService;

@RestController
@RequestMapping("/basicdetails")
public class BasicInformationController {
	
	@Autowired
	BasicInformationService basicInformationService;
	
	@RequestMapping(value="/getbasicinfo", method=RequestMethod.GET)
	public List<BasicInformation> getBasicInformation() {
	     return basicInformationService.getBasicInformation();
	}
	
	@PostMapping(value="/samebasicinfo", consumes="application/json")
	public void saveBasicInformation(@RequestBody BasicInformation basicinfo) {
		basicInformationService.saveBasicInformation(basicinfo);
	}
	
	@DeleteMapping(value="/removebasicinfo/{id}")
    public void removeBasicInformation(@PathVariable("id")int Id) {
		basicInformationService.removeBasicInformation(Id);
	}
}

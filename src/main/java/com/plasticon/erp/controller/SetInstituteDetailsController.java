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

import com.plasticon.erp.model.SetInstituteDetails;
import com.plasticon.erp.service.SetInstituteDetailsService;

@RestController
@RequestMapping("/institutedetails")
public class SetInstituteDetailsController {
       
	@Autowired
	SetInstituteDetailsService setInstituteDetailsService;
	
	@RequestMapping(value="/getinstitutedetails", method=RequestMethod.GET)
	public List<SetInstituteDetails> getInstituteDetails() {
		return setInstituteDetailsService.getInstituteDetails();
	}
	
	@PostMapping(value="/saveinstitutedetails", consumes="application/json")
	public void saveInstituteDetails(@RequestBody SetInstituteDetails setinstitutedetails) {
		setInstituteDetailsService.saveInstituteDetails(setinstitutedetails);
	}
	
	@DeleteMapping(value="/removeinstitutedetails/{id}")
	public void removeInstituteDetails(@PathVariable("id")int Id) {
		setInstituteDetailsService.removeInstituteDetails(Id);
	}
}

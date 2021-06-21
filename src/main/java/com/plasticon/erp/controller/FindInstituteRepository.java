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

import com.plasticon.erp.model.FindInstitute;
import com.plasticon.erp.service.FindInstituteService;

@RestController
@RequestMapping("/registration")
public class FindInstituteRepository {
	
	@Autowired
	FindInstituteService findInstituteService;
	
	@RequestMapping(value="/getinstitute", method=RequestMethod.GET)
	public List<FindInstitute> getInstituteName() {
		return findInstituteService.getInstituteName();
	}
	
	@PostMapping(value="/saveinstitute", consumes="application/json")
	public void saveInstituteName(@RequestBody FindInstitute findinstitute) {
		findInstituteService.saveFindInstitute(findinstitute);
	}
	
	@DeleteMapping(value="/removeinstitute/{id}")
	public void removeInstituteName(@PathVariable("id")int Id) {
		findInstituteService.removeFindInstitute(Id);
	}

}

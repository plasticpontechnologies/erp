package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.FindInstitutes;
import com.plasticon.erp.service.FindInstituteService;

@RestController
@RequestMapping("/findinstitute")
public class FindInstituteController {

	@Autowired
	FindInstituteService findInstituteService;
	
	@RequestMapping(value="/getinstitutes", method=RequestMethod.GET)
	public List<FindInstitutes> getFindInstitutes() {
		return findInstituteService.getInstituteName();
	}
	
	@PostMapping(value="/saveinstitutes", consumes="application/json")
	public void saveFindInstitute(@RequestBody FindInstitutes findinstitute) {
		findInstituteService.saveFindInstitute(findinstitute);
	}
	
}

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

import com.plasticon.erp.model.FeesDueSchool;
import com.plasticon.erp.service.FeesDueSchoolService;

@RestController
@RequestMapping("/feesdueschool")
public class FeesDueSchoolController {
	@Autowired
	private FeesDueSchoolService feesDueSchoolService;
	
	@RequestMapping(value = "/getFeesDueSchoolDetails", method = RequestMethod.GET)
	public List<FeesDueSchool> getFeesDueSchool() {
		return feesDueSchoolService.getFeesDueSchool();

	}

	@PostMapping(value = "/saveFeesDueSchoolDetails", consumes = "application/json")
	public void saveFeesDueSchool(@RequestBody FeesDueSchool feesDueSchool) {
		feesDueSchoolService.saveFeesDueSchool(feesDueSchool);

	}

	@DeleteMapping(value = "/removeFeesDueSchool/{id}")
	public void removeFeesDueSchool(@PathVariable("id") int Id) {
		feesDueSchoolService.removeFeesDueSchool(Id);
	}

}

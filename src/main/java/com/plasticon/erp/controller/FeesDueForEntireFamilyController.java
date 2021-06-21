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

import com.plasticon.erp.model.FeesDueForEntireFamily;
import com.plasticon.erp.service.FeesDueForEntireFamilyService;

@RestController
@RequestMapping("/feesdueforfamily")
public class FeesDueForEntireFamilyController {
	@Autowired
	private FeesDueForEntireFamilyService feesDueForEntireFamilyService;
	
	@RequestMapping(value = "/getFeesDueForEntireFamilyDetails", method = RequestMethod.GET)
	public List<FeesDueForEntireFamily> getFeesDueForEntireFamily() {
		return feesDueForEntireFamilyService.getFeesDueForEntireFamily();

	}

	@PostMapping(value = "/saveFeesDueForEntireFamilyDetails", consumes = "application/json")
	public void saveFeesDueForEntireFamily(@RequestBody FeesDueForEntireFamily feesDueForEntireFamily) {
		feesDueForEntireFamilyService.saveFeesDueForEntireFamily(feesDueForEntireFamily);

	}

	@DeleteMapping(value = "/removeFeesDueForEntireFamily/{id}")
	public void removeFeesDueForEntireFamily(@PathVariable("id") int Id) {
		feesDueForEntireFamilyService.removeFeesDueForEntireFamily(Id);
	}

}

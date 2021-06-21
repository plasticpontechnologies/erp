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

import com.plasticon.erp.model.FeesDue;
import com.plasticon.erp.service.FeesDueService;

@RestController
@RequestMapping("/feesdue")
public class FeesDueController {
	@Autowired
	private FeesDueService feesDueService;
	
	@RequestMapping(value = "/getFeesDueDetails", method = RequestMethod.GET)
	public List<FeesDue> getFeesDue() {
		return feesDueService.getFeesDue();

	}

	@PostMapping(value = "/saveFeesDueDetails", consumes = "application/json")
	public void saveFeesDue(@RequestBody FeesDue feesDue) {
		feesDueService.saveFeesDue(feesDue);

	}

	@DeleteMapping(value = "/removeFeesDue/{id}")
	public void removeFeesDue(@PathVariable("id") int Id) {
		feesDueService.removeFeesDue(Id);
	}

}

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

import com.plasticon.erp.model.TerminationReason;
import com.plasticon.erp.service.TerminationReasonService;
@RestController
@RequestMapping("/terminationreason")
public class TerminationReasonController {
	@Autowired
	TerminationReasonService terminationReasonService;
	
	@RequestMapping(value = "/getTerminationReason", method = RequestMethod.GET)
	public List<TerminationReason> getTerminationReason() {
		return terminationReasonService.getTerminationReason();

	}

	@PostMapping(value = "/saveTerminationReason", consumes = "application/json")
	public void saveTerminationReason(@RequestBody TerminationReason terminationReason) {
		terminationReasonService.saveTerminationReason(terminationReason);

	}

	@DeleteMapping(value = "/removeTerminationReason/{id}")
	public void removeTerminationReason(@PathVariable("id") int Id) {
		terminationReasonService.removeTerminationReason(Id);
	}

	

}

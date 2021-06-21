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

import com.plasticon.erp.model.Occupation;
import com.plasticon.erp.service.OccupationService;

@RestController
@RequestMapping("/occupation")
public class OccupationController {
	@Autowired
	OccupationService occupationService;
	
	@RequestMapping(value = "/getOccupation", method = RequestMethod.GET)
	public List<Occupation> getOccupation() {
		return occupationService.getOccupation();

	}

	@PostMapping(value = "/saveOccupation", consumes = "application/json")
	public void saveOccupation(@RequestBody Occupation occupation) {
		occupationService.saveOccupation(occupation);

	}

	@DeleteMapping(value = "/removeOccupation/{id}")
	public void removeOccupation(@PathVariable("id") int Id) {
		occupationService.removeOccupation(Id);
	}


}

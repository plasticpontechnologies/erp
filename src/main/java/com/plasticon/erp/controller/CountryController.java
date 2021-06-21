package com.plasticon.erp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.Country;
import com.plasticon.erp.service.CountryService;

@RestController
@RequestMapping("/contactinfo")
public class CountryController {

	@Autowired
	CountryService countryService;

	@RequestMapping(value = "/getcountry", method = RequestMethod.GET)
	public List<Country> getCountry() {
		return countryService.getCountry();
	}
	
	@PostMapping(value = "/savecountry", consumes = "application/json")
	public void saveCountry(@RequestBody Country country) {
		countryService.saveCountry(country);
	}

	@RequestMapping(value = "/getstates/{id}", method = RequestMethod.GET)
	public List<Country> getStateDetails(@PathVariable int id) {
		return countryService.getStateDetails(id);
	}

}

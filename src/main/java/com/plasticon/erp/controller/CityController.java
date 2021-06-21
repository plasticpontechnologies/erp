package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.City;
import com.plasticon.erp.service.CityService;

@RestController
@RequestMapping("/contactinfo")
public class CityController {
	
	@Autowired
	CityService cityService;
    @RequestMapping(value="/getcitydetails", method=RequestMethod.GET)
	public List<City> getCity() {
    	return cityService.getCity();
	}
    
    @PostMapping(value="/savecitydetails", consumes="application/json")
    public void saveCity(@RequestBody City city) {
    	cityService.saveCity(city);
    }
}

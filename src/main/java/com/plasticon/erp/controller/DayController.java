package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.DayDetails;

import com.plasticon.erp.service.DayService;


@RestController
@RequestMapping("/day")
public class DayController {
	@Autowired
	DayService dayService;

	@RequestMapping(value = "/getDayDetails", method = RequestMethod.GET)
	public List<DayDetails>  getMenuTypeData() {
		return dayService.getDayDetails();

	}
	

	
	

}

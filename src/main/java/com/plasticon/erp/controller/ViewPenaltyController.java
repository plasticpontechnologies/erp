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

import com.plasticon.erp.model.ViewPenalty;
import com.plasticon.erp.service.ViewPenaltyService;

@RestController
@RequestMapping("/ManagePenalty")

public class ViewPenaltyController {
	
	@Autowired
	ViewPenaltyService viewPenaltySerivce;
	
	@RequestMapping(value = "/getViewPenalty", method= RequestMethod.GET)
	public List<ViewPenalty>getViewPenaltyData(){
	return viewPenaltySerivce.getViewPenalty();
	}
	
	@PostMapping(value = "/saveViewPenalty", consumes = "application/json")
	public void saveViewPenality(@RequestBody ViewPenalty ManagePenalty) {
		viewPenaltySerivce.saveViewPenalty(ManagePenalty);
	}
	
	@DeleteMapping(value ="/removeViewPenalty/{id}")
	public void removeViewPenalty(@PathVariable ("id") int id) {
		viewPenaltySerivce.removeViewPenalty(id);
	}
	
	
	
	

}

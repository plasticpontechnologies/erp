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

import com.plasticon.erp.model.State;
import com.plasticon.erp.service.StateService;

@RestController
@RequestMapping("/contactinfo")
public class StateController {
	
	@Autowired
	StateService stateService;
    
	@RequestMapping(value="/getstatedetails", method=RequestMethod.GET)
	public List<State> getState() {
		return stateService.getState();
	}
	
	@PostMapping(value="/savestatedetails", consumes="application/json")
	public void saveState(@RequestBody State state) {
		stateService.saveState(state);
	}
	
	@DeleteMapping(value="/removestatedetails/{id}")
	public void removeState(@PathVariable("id")int Id) {
	    stateService.removeState(Id);
	}
}

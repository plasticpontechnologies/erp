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

import com.plasticon.erp.model.DefineShiftDetails;

import com.plasticon.erp.service.DefineShiftService;
;

@RestController
@RequestMapping("/defineshift")
public class DefineShiftController {
    
	@Autowired
	DefineShiftService defineShiftService;

	@RequestMapping(value = "/getDefineShiftDetails", method = RequestMethod.GET)
	public List<DefineShiftDetails>  getDefineShiftData() {
		return defineShiftService.getDefineShiftDetails();

	}
	
	  @PostMapping(value = "/saveDefineShiftDetails", consumes = "application/json")
		public void saveDefineShiftDetails(@RequestBody DefineShiftDetails defineshift) {
			defineShiftService.saveDefineShiftDetails(defineshift);

		}
		

	  @DeleteMapping(value ="/removeDfineShiftDetails/{id}")
	    public void removeDefineShiftDetails(@PathVariable("id")int Id){
		  defineShiftService.removeDefineShiftDetails(Id);
	    }
	
}

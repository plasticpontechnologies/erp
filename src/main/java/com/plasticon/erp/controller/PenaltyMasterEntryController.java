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

import com.plasticon.erp.model.PenaltyMasterEntry;
import com.plasticon.erp.service.PenaltyMasterEntryService;

@RestController
@RequestMapping("/ManagePenalty")

public class PenaltyMasterEntryController {
	@Autowired
	PenaltyMasterEntryService penaltyMasterEntryService;
	
	@RequestMapping(value = "/getPenaltyMasterEntry", method = RequestMethod.GET)
	public List<PenaltyMasterEntry>  getPenaltyMasterEntryData() {
		return penaltyMasterEntryService.getPenaltyMasterEntry();

	}
	
	  @PostMapping(value = "/savePenaltyMasterEntry", consumes = "application/json")
		public void savePenaltyMasterEntry(@RequestBody PenaltyMasterEntry ManagePenalty) {
			penaltyMasterEntryService.savePenaltyMasterEntry(ManagePenalty);

		}
		

	  @DeleteMapping(value ="/removePenaltyMasterEntry/{id}")
	    public void removePenaltyMasterEntry(@PathVariable("id")int Id){
		  penaltyMasterEntryService.removePenaltyMasterEntry(Id);
	    }


}

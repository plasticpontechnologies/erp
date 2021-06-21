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

import com.plasticon.erp.model.ComplaintType;
import com.plasticon.erp.model.Reference;
import com.plasticon.erp.service.ComplaintTypeService;
import com.plasticon.erp.service.ReferenceService;

@RestController
@RequestMapping("/FrontOfficeMasterEntry")
public class ReferenceController {
	@Autowired
	ReferenceService referenceService;

	@RequestMapping(value = "/getReference", method = RequestMethod.GET)
	public List<Reference>  getReferenceData() {
		return referenceService.getReference();

	}
	
	  @PostMapping(value = "/saveReference", consumes = "application/json")
		public void saveReference(@RequestBody Reference MasterEntry) {
			referenceService.saveReference(MasterEntry);

		}
		

		  @DeleteMapping(value ="/removeReference/{id}")
		    public void removeReference(@PathVariable("id")int Id){
			  referenceService.removeReference(Id);
		    }

}

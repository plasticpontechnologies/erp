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

import com.plasticon.erp.model.Purpose;
import com.plasticon.erp.service.PurposeService;


@RestController
@RequestMapping("/FrontOfficeMasterEntry")
public class PurposeController {
	
		@Autowired
		PurposeService purposeService;

		@RequestMapping(value = "/getPurpose", method = RequestMethod.GET)
		public List<Purpose>  getPurposeData() {
			return purposeService.getPurpose();

		}
		
		  @PostMapping(value = "/savePurpose", consumes = "application/json")
			public void savePurpose(@RequestBody Purpose MasterEntry) {
			  purposeService.savePurpose(MasterEntry);

			}
			

			  @DeleteMapping(value ="/removePurpose/{id}")
			    public void removePurpose(@PathVariable("id")int Id){
				  purposeService.removePurpose(Id);
			    }

}

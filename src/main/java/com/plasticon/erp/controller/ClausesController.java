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

import com.plasticon.erp.model.CanteenMasterEntry;
import com.plasticon.erp.model.ClausesDetails;
import com.plasticon.erp.service.CanteenService;
import com.plasticon.erp.service.ClausesService;
@RestController
@RequestMapping("/MasterEntry")
public class ClausesController {
	
		@Autowired
		ClausesService clausesService;

		@RequestMapping(value = "/getClausesDetails", method = RequestMethod.GET)
		public List<ClausesDetails>  getClausesDetailsData() {
			return clausesService.getClausesDetails();

		}
		
		  @PostMapping(value = "/saveClausesDetails", consumes = "application/json")
			public void saveClausesDetails(@RequestBody ClausesDetails MasterEntry) {
				clausesService.saveClausesDetails(MasterEntry);

			}
			

			  @DeleteMapping(value ="/removeClausesDetails/{id}")
			    public void removeClausesDetails(@PathVariable("id")int Id){
				  clausesService.removeClausesDetails(Id);
			    }


}

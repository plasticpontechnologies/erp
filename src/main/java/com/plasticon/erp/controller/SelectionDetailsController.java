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

import com.plasticon.erp.model.SendMessageSelection;
import com.plasticon.erp.model.SelectionDetails;
import com.plasticon.erp.service.SelectionDetailsService;
import com.plasticon.erp.service.SendMessageSelectionService;

@RestController
@RequestMapping("/select")
public class SelectionDetailsController {

	
	@Autowired
	SelectionDetailsService  selectiondetailsService;
	
	@RequestMapping(value = "/getSelectionDetails", method = RequestMethod.GET)
	public List<SelectionDetails>  getSelectionDetailsData() {
		return selectiondetailsService.getSelectionDetails();

	}
	
	  @PostMapping(value = "/saveSelectionDetails", consumes = "application/json")
		public void saveSelectionDetails(@RequestBody SelectionDetails select) {
		  selectiondetailsService.saveSelectionDetails(select);

		}
		

		  @DeleteMapping(value ="/removeSectionDetails/{id}")
		    public void removeSelectionDetails(@PathVariable("id") int Id){
			  selectiondetailsService.removeSelectionDetails(Id);
		    }

}




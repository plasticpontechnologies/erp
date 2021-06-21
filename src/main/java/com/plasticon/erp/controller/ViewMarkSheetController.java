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

import com.plasticon.erp.model.SetupMarkSheetDetails;
import com.plasticon.erp.model.ViewMarkSheetDetails;
import com.plasticon.erp.model.ViewMenu;
import com.plasticon.erp.service.SetupMarkSheetService;
import com.plasticon.erp.service.ViewMarkSheetService;
import com.plasticon.erp.service.ViewMenuService;

@RestController
@RequestMapping("/VMS")
public class ViewMarkSheetController {
	
	@Autowired
	 ViewMarkSheetService viewMarkSheetService;
		
		@RequestMapping(value ="getViewMarkSheetDetails" , method = RequestMethod.GET)
		public List<ViewMarkSheetDetails>  getViewMarkSheetData() {
			return viewMarkSheetService.getViewMarkSheetDetails();
	}
		
		@PostMapping(value = "/saveViewMarkSheetDetails", consumes = "application/json")
		public void saveViewMarkSheetDetails(@RequestBody ViewMarkSheetDetails viewMarkSheet) {
			viewMarkSheetService.saveViewMarkSheetDetails(viewMarkSheet);

		}
		

	  @DeleteMapping(value ="/removeViewMarkSheetDetails/{id}")
	    public void removeViewMarkSheetDetails(@PathVariable("id")int Id){
		  viewMarkSheetService.removeViewMarkSheetDetails(Id);
	    }

	
}

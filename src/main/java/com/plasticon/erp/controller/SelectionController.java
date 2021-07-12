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

import com.plasticon.erp.model.SectionDetails;
import com.plasticon.erp.model.Selection;
import com.plasticon.erp.service.SelectionService;

@RestController
@RequestMapping("/selection")
public class SelectionController {
	
	@Autowired
	SelectionService selectionService;
	
	@RequestMapping(value = "/getSelectionDetails", method = RequestMethod.GET)
	public List<Selection>  getSelectionData() {
		return selectionService.getSelectionDetails();

	}
	
	  @PostMapping(value = "/saveSelectionDetails", consumes = "application/json")
		public void saveSelectionDetails(@RequestBody Selection sel) {
		  selectionService.saveSelectionDetails(sel);

		}
		

		  @DeleteMapping(value ="/removeSectionDetails/{id}")
		    public void removeSelectionDetails(@PathVariable("id") int Id){
			  selectionService.removeSelectionDetails(Id);
		    }

}


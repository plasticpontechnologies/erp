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

import com.plasticon.erp.model.ModifyStaffDocumentDetails;
import com.plasticon.erp.service.ModifyStaffDocumentService;

@RestController
@RequestMapping("/MSD")
public class ModifyStaffDocumentController {

	
	@Autowired
	ModifyStaffDocumentService modifyStaffDocumentService;

	@RequestMapping(value = "/getModifyStaffDocumentDetails", method = RequestMethod.GET)
	public List<ModifyStaffDocumentDetails>  getModifyStaffDocumentData() {
		return modifyStaffDocumentService.getModifyStaffDocumentDetails();

	}
	
	  @PostMapping(value = "/saveModifyStaffDocumentDetails", consumes = "application/json")
		public void saveModifyStaffDocumentDetails(@RequestBody ModifyStaffDocumentDetails modifystaffDocument) {
			modifyStaffDocumentService.saveModifyStaffDocumentDetails(modifystaffDocument);

		}
		

	  @DeleteMapping(value ="/removeModifyStaffDocumentDetails/{id}")
	    public void removeModifyStaffDocumentDetails(@PathVariable("id")int Id){
		  modifyStaffDocumentService.removeModifyStaffDocumentDetails(Id);
	    }
}

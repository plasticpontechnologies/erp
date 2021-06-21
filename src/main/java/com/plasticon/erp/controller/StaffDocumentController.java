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


import com.plasticon.erp.model.StaffDocumentDetails;
import com.plasticon.erp.service.StaffDocumentService;

@RestController
@RequestMapping("/staffdoc")
public class StaffDocumentController {
	
	@Autowired
	StaffDocumentService staffDocumentService;
	
	@RequestMapping(value ="getStaffDocumentDetails" , method = RequestMethod.GET)
	public List<StaffDocumentDetails>  getStaffdocumentData() {
		return staffDocumentService.getStaffDocumentDetails();
}
	
	@PostMapping(value = "/saveStaffDocumentDetails", consumes = "application/json")
	public void saveStaffDocumentDetails(@RequestBody StaffDocumentDetails staffDocument) {
		staffDocumentService.saveStaffDocumentDetails(staffDocument);

	}
	

  @DeleteMapping(value ="/removeStaffDocumentDetails/{id}")
    public void removeStaffDocumentDetails(@PathVariable("id")int Id){
	  staffDocumentService.removeStaffDocumentDetails(Id);
    }
}

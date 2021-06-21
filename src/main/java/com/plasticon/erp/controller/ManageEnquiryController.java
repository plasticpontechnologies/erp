package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.plasticon.erp.model.ManageEnquiry;
import com.plasticon.erp.service.ManageEnquiryService;

@RestController
@RequestMapping(value="/manageenquiry")
public class ManageEnquiryController {
@Autowired
ManageEnquiryService manageEnquiryService;

	@GetMapping(value="/getmanageenquiry")
	public List<ManageEnquiry> getManageEnquiryDetails(){
		return manageEnquiryService.getManageEnquiryDetails();
	}

	@PostMapping(value="/savemanageenquiry",consumes="application/json")
	public void saveManageEnquiryDetails(@RequestBody ManageEnquiry manageEnquiry) {
		manageEnquiryService.saveManageEnquiryDetails(manageEnquiry);
	}
	@DeleteMapping(value="/deletemanageenquiry/{manageEnquiryId}")
	public void deleteManageEnquiryDetailsById(@PathVariable int manageEnquiryId) {
		manageEnquiryService.deletManageEnquiryDetailsById(manageEnquiryId);
	}
}

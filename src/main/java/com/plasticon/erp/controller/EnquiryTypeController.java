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

import com.plasticon.erp.model.EnquiryType;
import com.plasticon.erp.service.EnquiryTypeService;



@RestController
@RequestMapping("/FrontOfficeMasterEntry")
public class EnquiryTypeController {
	@Autowired
	EnquiryTypeService enquiryTypeService;

	@RequestMapping(value = "/getEnquiryType", method = RequestMethod.GET)
	public List<EnquiryType>  getEnquiryTypeData() {
		return enquiryTypeService.getEnquiryType();

	}
	
	  @PostMapping(value = "/saveEnquiryType", consumes = "application/json")
		public void saveEnquiryType(@RequestBody EnquiryType MasterEntry) {
		  enquiryTypeService.saveEnquiryType(MasterEntry);

		}
		

		  @DeleteMapping(value ="/removeEnquiryType/{id}")
		    public void removeEnquiryType(@PathVariable("id")int Id){
			  enquiryTypeService.removeEnquiryType(Id);
		    }

}

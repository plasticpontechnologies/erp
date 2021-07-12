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
import com.plasticon.erp.model.ContactInfo;
import com.plasticon.erp.service.ContactInfoService;

@RestController
@RequestMapping("/basicinfo")
public class ContactInfoController {
	
	@Autowired
	ContactInfoService contactInfoService;
	
	 @RequestMapping(value="/getcontactinfo", method=RequestMethod.GET)
		public List<ContactInfo> getContactInfon() {
	    	return contactInfoService.getContactInfo();
		}
	    
	    @PostMapping(value="/savecontactinfo", consumes="application/json")
	    public void saveContactInfo(@RequestBody ContactInfo contactinfo) {
	    	contactInfoService.saveContactInfo(contactinfo);
	    }
	    
	    @DeleteMapping(value="/removecontactinfo/{id}")
	    public void removeContactInfo(@PathVariable("id")int id) {
	    	contactInfoService.deleteContactInfo(id);
	    }


}


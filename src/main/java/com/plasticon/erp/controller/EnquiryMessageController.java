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

import com.plasticon.erp.model.EnquiryMessage;
import com.plasticon.erp.model.SendSmsToStaff;
import com.plasticon.erp.service.EnquiryMessageService;

@RestController
@RequestMapping("/enquirymessage")
public class EnquiryMessageController {

	@Autowired
	public EnquiryMessageService enquirymessageService;
	
	@RequestMapping(value = "/getEnquiryMessage", method = RequestMethod.GET)
	public List<EnquiryMessage>  getEnquiryMessageData() {
		return enquirymessageService.getEnquiryMessage();

	}
	
	  @PostMapping(value = "/saveEnquiryMessage", consumes = "application/json")
		public void saveEnquiryMessage(@RequestBody EnquiryMessage enquirymessage) {
		  enquirymessageService.saveEnquiryMessage(enquirymessage);

		}
		

		  @DeleteMapping(value ="/removeEnquiryMessage/{id}")
		    public void removeEnquiryMessage(@PathVariable("id")int Id){
			  enquirymessageService.removeEnquiryMessage(Id);
		    }
	
}

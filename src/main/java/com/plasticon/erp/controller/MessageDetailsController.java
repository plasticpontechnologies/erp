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

import com.plasticon.erp.model.Message;
import com.plasticon.erp.model.MessageDetails;
import com.plasticon.erp.service.MessageDetailsService;


@RestController
@RequestMapping("/message")
public class MessageDetailsController {

	@Autowired
	MessageDetailsService messagedetailsService;
	
	@RequestMapping(value = "/getMessageDetails", method = RequestMethod.GET)
	public List<MessageDetails>  getMessageDetailsData() {
		return messagedetailsService.getMessageDetails();

	}
	
	  @PostMapping(value = "/saveMessageDetails", consumes = "application/json")
		public void saveMessage(@RequestBody MessageDetails  message) {
		  messagedetailsService.saveMessageDetails(message);

		}
		

		  @DeleteMapping(value ="/removeMessageDetails/{id}")
		    public void removeMessageDetails(@PathVariable("id")int Id){
			  messagedetailsService.removeMessageDetails(Id);
		    }


}



package com.plasticon.erp.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.CanteenMasterEntry;
import com.plasticon.erp.model.Message;
import com.plasticon.erp.repository.MessageRepository;
import com.plasticon.erp.service.MessageService;

@RestController
@RequestMapping("/msg")
public class MessageController {
	
	@Autowired
	MessageService messageService;
	
	
	@RequestMapping(value = "/getMessageDetails", method = RequestMethod.GET)
	public List<Message>  getMessageData() {
		return messageService.getMessage();

	}
	
	  @PostMapping(value = "/saveMessageDetails", consumes = "application/json")
		public void saveMessage(@RequestBody Message msg) {
		  messageService.saveMessage(msg);

		}
		

		  @DeleteMapping(value ="/removeMessage/{id}")
		    public void removeMessage(@PathVariable("id")int Id){
			  messageService.removeMessage(Id);
		    }


}

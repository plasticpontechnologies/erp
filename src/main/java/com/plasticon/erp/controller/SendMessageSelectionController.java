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
import com.plasticon.erp.model.SendMessageSelection;
import com.plasticon.erp.service.SendMessageSelectionService;

@RestController
@RequestMapping("/msgselection")
public class SendMessageSelectionController {
	
	@Autowired
	SendMessageSelectionService sendMessageSelectionService;
	
	@RequestMapping(value = "/getMsgSelectionDetails", method = RequestMethod.GET)
	public List<SendMessageSelection>  getSelectionData() {
		return sendMessageSelectionService.getSelectionDetails();

	}
	
	  @PostMapping(value = "/saveMsgSelectionDetails", consumes = "application/json")
		public void saveSelectionDetails(@RequestBody SendMessageSelection sel) {
		  sendMessageSelectionService.saveSelectionDetails(sel);

		}
		

		  @DeleteMapping(value ="/removeMsgSectionDetails/{id}")
		    public void removeSelectionDetails(@PathVariable("id") int Id){
			  sendMessageSelectionService.removeSelectionDetails(Id);
		    }

}


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

import com.plasticon.erp.model.TransferClass;
import com.plasticon.erp.service.TransferClassService;

@RestController
@RequestMapping("/transferclass")
public class TransferClassController {

	@Autowired
	TransferClassService transferClassService;

	@RequestMapping(value = "/getTransferClassDetails", method = RequestMethod.GET)
	public List<TransferClass> getTransferClass() {
		return transferClassService.getTransferClass();

	}

	@PostMapping(value = "/saveTransferClassDetails", consumes = "application/json")
	public void saveTransferClass(@RequestBody TransferClass transferclass) {
		transferClassService.saveTransferClass(transferclass);

	}

	@DeleteMapping(value = "/removeTransferClass/{id}")
	public void removeTransferClass(@PathVariable("id") int Id) {
		transferClassService.removeTransferClass(Id);
	}

}

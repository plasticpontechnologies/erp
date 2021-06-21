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

import com.plasticon.erp.model.AddCall;
import com.plasticon.erp.service.AddCallService;

@RestController
@RequestMapping(value="/addcall")
public class AddCallController {
	
	@Autowired
	AddCallService addCallService;


		@GetMapping(value="/getaddcall")
		public List<AddCall> getAddCallDetails(){
			return addCallService.getAddCallDetails();
		}
		
		@PostMapping(value="/saveaddcall",consumes="application/json")
		public void saveAddCallDetails(@RequestBody AddCall addCall) {
			addCallService.saveAddCallDetails(addCall);
		}
		@DeleteMapping(value="/deleteaddcall/{addCallId}")
		public void deleteAddCallDetailsById(@PathVariable int addCallId) {
			addCallService.deleteAddCallDetailsById(addCallId);
		}
}

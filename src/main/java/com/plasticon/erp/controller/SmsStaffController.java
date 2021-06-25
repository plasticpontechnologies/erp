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

import com.plasticon.erp.model.SendSmsToStaff;
import com.plasticon.erp.model.ViewMenu;
import com.plasticon.erp.service.SmsStaffService;

@RestController
@RequestMapping("/smsstaff")
public class SmsStaffController {

	
	@Autowired
	public SmsStaffService smsstaffService;
	
	@RequestMapping(value = "/getSendSmsToStaff", method = RequestMethod.GET)
	public List<SendSmsToStaff>  getSendSmsToStaffData() {
		return smsstaffService.getSendSmsToStaff();

	}
	
	  @PostMapping(value = "/saveSendSmsToStaff", consumes = "application/json")
		public void saveSendSmsToStaff(@RequestBody SendSmsToStaff smsstaff) {
		  smsstaffService.saveSendSmsToStaff(smsstaff);

		}
		

		  @DeleteMapping(value ="/removeSendSmsToStaff/{id}")
		    public void removeSendSmsToStaff(@PathVariable("id")int Id){
			  smsstaffService.removeSendSmsToStaff(Id);
		    }
	

}

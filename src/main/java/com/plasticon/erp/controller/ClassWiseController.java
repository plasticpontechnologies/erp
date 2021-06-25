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

import com.plasticon.erp.model.PrincipalSignature;
import com.plasticon.erp.model.SendSmsToClassWise;
import com.plasticon.erp.service.ClasswiseService;

@RestController
@RequestMapping("/classwise")
public class ClassWiseController {

	@Autowired
	public ClasswiseService  classwiseService;
	
	
	@RequestMapping(value = "/getSendSmsToClassWise", method = RequestMethod.GET)
	public List<SendSmsToClassWise>  getSendSmsToClassWiseData() {
		return classwiseService.getSendSmsToClassWise();

	}
	
	  @PostMapping(value = "/saveSendSmsToClassWise", consumes = "application/json")
		public void saveSendSmsToClassWise(@RequestBody SendSmsToClassWise classwise) {
		  classwiseService.saveSendSmsToClassWise(classwise);

		}
		

	  @DeleteMapping(value ="/removeSendSmsToClassWise/{id}")
	    public void removeSendSmsToClassWise(@PathVariable("id")int Id){
		  classwiseService.removeSendSmsToClassWise(Id);
	    }

}

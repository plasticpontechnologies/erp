package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.GenerateIdCardDetails;
import com.plasticon.erp.service.GenerateIdCardService;


@RestController
@RequestMapping("/generate_idcard")
public class GenerateIdCardController {
	 
	
	GenerateIdCardService generateIdCardService;

	@RequestMapping(value = "/getGenerateIdcardDetails", method = RequestMethod.GET)
	public List<GenerateIdCardDetails>  getGenerateIdCardData() {
		return generateIdCardService.getGenerateIdCardDetails();

	}
	
	  @PostMapping(value = "/saveGenerateIdCardDetails", consumes = "application/json")
		public void saveGenerateIdCardDetails(@RequestBody GenerateIdCardDetails generateIdCard) {
			generateIdCardService.saveGenerateIdCardDetails(generateIdCard);

		}
		

	  @DeleteMapping(value ="/removeGenerateIdCardDetails/{id}")
	    public void removeGenerateIdCardDetails(@PathVariable("id")int Id){
		  generateIdCardService.removeGenerateIdCardDetails(Id);
	    }
	  

}

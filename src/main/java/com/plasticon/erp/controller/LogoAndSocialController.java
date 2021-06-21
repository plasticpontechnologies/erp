package com.plasticon.erp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.LogoAndSocial;
import com.plasticon.erp.service.LogoAndSocialService;

@RestController
@RequestMapping("/basicdetails")
public class LogoAndSocialController {
	
	private static final Logger logger = LoggerFactory.getLogger(LogoAndSocialController.class);
	@Autowired
	LogoAndSocialService logoAndSocialService;
	@RequestMapping(value="/getlogoandsocial", method=RequestMethod.GET)
    public List<LogoAndSocial> getLogoAndSocial() {
    	return logoAndSocialService.getLogoAndSocial();
    }
	
	@PostMapping(value="savelogoandsocial", consumes="application/json")
	public void saveLogoAndSocial(LogoAndSocial logoandsocial) {
		logoAndSocialService.saveLogoAndSocialRepository(logoandsocial);
	}
	
	@DeleteMapping(value="removelogoandsocial/{id}")
	public void removeLogoAndSocial(@PathVariable("id")int Id) {
		logoAndSocialService.removeLogoAndSocial(Id);
	}
}

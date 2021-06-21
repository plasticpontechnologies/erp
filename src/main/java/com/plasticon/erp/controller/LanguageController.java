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

import com.plasticon.erp.model.Language;

import com.plasticon.erp.service.LanguageService;

@RestController
@RequestMapping("/MasterEntry")
public class LanguageController {
	@Autowired
	LanguageService languageService;

	@RequestMapping(value = "/getLanguage", method = RequestMethod.GET)
	public List<Language>  getLanguage() {
		return languageService.getLanguage();

	}
	
	  @PostMapping(value = "/saveLanguage", consumes = "application/json")
		public void saveLanguage(@RequestBody Language MasterEntry ) {
			languageService.saveLanguage(MasterEntry);

		}
		

		  @DeleteMapping(value ="/removeLanguage/{id}")
		    public void removeLanguage(@PathVariable("id")int Id){
			  languageService.removeLanguage(Id);
		    }

	
		
}

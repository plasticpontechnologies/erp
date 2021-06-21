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


import com.plasticon.erp.model.LanguageTranslate;

import com.plasticon.erp.service.LanguageTranslateService;
@RestController
@RequestMapping("/MasterEntry")
public class LanguageTranslateController {
	
	@Autowired
	LanguageTranslateService languageTranslateService;

	@RequestMapping(value = "/getLanguageTranslate", method = RequestMethod.GET)
	public List<LanguageTranslate>  getLanguageTranslate() {
		return languageTranslateService.getLanguageTranslate();

	}
	
	  @PostMapping(value = "/saveLanguageTranslate", consumes = "application/json")
		public void saveLanguageTranslate(@RequestBody LanguageTranslate MasterEntry ) {
			languageTranslateService.saveLanguageTranslate(MasterEntry);

		}
		

		  @DeleteMapping(value ="/removeLanguageTranslate/{id}")
		    public void removeLanguageTranslate(@PathVariable("id")int Id){
			  languageTranslateService.removeLanguageTranslate(Id);
		    }

}

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

import com.plasticon.erp.model.Birthdays;
import com.plasticon.erp.model.SurveyReport;
import com.plasticon.erp.service.BirthdaysService;

@RestController
@RequestMapping("/birthday")
public class BirthdaysController {

	@Autowired
	BirthdaysService birthdaysService;
	
	@RequestMapping(value = "/getBirthdaysDetails", method = RequestMethod.GET)
	public List<Birthdays>  getBirthdaysData() {
		return birthdaysService.getBirthdays();

	}
	
	  @PostMapping(value = "/saveBirthdaysDetails", consumes = "application/json")
		public void saveBirthdays(@RequestBody Birthdays birthday) {
		  birthdaysService.saveBirthdays(birthday);

		}
		

		  @DeleteMapping(value ="/removeBirthdays/{id}")
		    public void removeBirthdays(@PathVariable("id")int Id){
			  birthdaysService.removeBirthdays(Id);
		    }

}

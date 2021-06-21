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

import com.plasticon.erp.model.Gender;
import com.plasticon.erp.service.GenderService;

@RestController
@RequestMapping("/gender")
public class GenderController {
	@Autowired
	GenderService genderService;
	
	@RequestMapping(value = "/getGender", method = RequestMethod.GET)
	public List<Gender> getGender() {
		return genderService.getGender();

	}

	@PostMapping(value = "/saveGender", consumes = "application/json")
	public void saveGender(@RequestBody Gender gender) {
		genderService.saveGender(gender);

	}

	@DeleteMapping(value = "/removeGender/{id}")
	public void removeGender(@PathVariable("id") int Id) {
		genderService.removeGender(Id);
	}

}

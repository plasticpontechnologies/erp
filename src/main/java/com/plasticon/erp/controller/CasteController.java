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

import com.plasticon.erp.model.Caste;
import com.plasticon.erp.service.CasteService;

@RestController
@RequestMapping("/caste")
public class CasteController {
	@Autowired
	CasteService casteService;
	
	@RequestMapping(value = "/getCasteDetails", method = RequestMethod.GET)
	public List<Caste> getCaste() {
		return casteService.getCaste();

	}

	@PostMapping(value = "/saveCasteDetails", consumes = "application/json")
	public void saveCaste(@RequestBody Caste caste) {
		casteService.saveCaste(caste);

	}

	@DeleteMapping(value = "/removeCaste/{id}")
	public void removeCaste(@PathVariable("id") int Id) {
		casteService.removeCaste(Id);
	}

}

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

import com.plasticon.erp.model.DefineFamily;
import com.plasticon.erp.service.DefineFamilyService;

@RestController
@RequestMapping("/definefamily")
public class DefineFamilyController {

	@Autowired
	DefineFamilyService defineFamilyService;
	
	@RequestMapping(value = "/getDefineFamilyDetails", method = RequestMethod.GET)
	public List<DefineFamily>  getDefineFamily() {
		return defineFamilyService.getDefineFamily();

	}
	
	@PostMapping(value = "/saveDefineFamilyDetails", consumes = "application/json")
	public void saveDefineFamily(@RequestBody DefineFamily family) {
		defineFamilyService.saveDefineFamily(family);

	}
		

	  @DeleteMapping(value ="/removeDefineFamily/{id}")
	    public void removeDefineFamily(@PathVariable("id")int Id){
		  defineFamilyService.removeDefineFamily(Id);
	    }

}

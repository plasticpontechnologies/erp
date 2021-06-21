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

import com.plasticon.erp.model.Binding;
import com.plasticon.erp.model.Division;
import com.plasticon.erp.service.DivisionService;

@RestController
@RequestMapping("/div")
public class DivisionController {

	@Autowired
	DivisionService divisionService;
	
	@RequestMapping(value = "/getDivisionDetails", method = RequestMethod.GET)
	public List<Division>  getDivisionData() {
		return divisionService.getDivision();

	}
	
	  @PostMapping(value = "/saveDivisionDetails", consumes = "application/json")
		public void saveDivision(@RequestBody Division div) {
		  divisionService.saveDivision(div);

		}
		

		  @DeleteMapping(value ="/removeDivision/{id}")
		    public void removeDivision(@PathVariable("id")int Id){
			  divisionService.removeDivision(Id);
		    }

}

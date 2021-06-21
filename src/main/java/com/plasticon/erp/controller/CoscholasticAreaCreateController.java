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

import com.plasticon.erp.model.CoscholasticAreaCreateDetails;
import com.plasticon.erp.service.CoscholasticAreaCreateService;



@RestController
@RequestMapping("/CSAC")
public class CoscholasticAreaCreateController {
	
	@Autowired
    CoscholasticAreaCreateService coscholasticAreaCreateService;
	
	@RequestMapping(value ="/getCoscholasticAreaCreateDetails" , method = RequestMethod.GET)
	public List<CoscholasticAreaCreateDetails>  getCoscholasticAreaCreateData() {
		return coscholasticAreaCreateService.getCoscholasticAreaCreateDetails();
}
	
	@PostMapping(value = "/saveCoscholasticAreaCreateDetails", consumes = "application/json")
	public void saveCoscholasticAreaCreateDetails(@RequestBody CoscholasticAreaCreateDetails coscholasticAreaCreate) {
		coscholasticAreaCreateService.saveCoscholasticAreaCreateDetails(coscholasticAreaCreate);

	}
	

  @DeleteMapping(value ="/removecoscholasticAreaCreateDetails/{id}")
    public void removeCoscholasticAreaCreateDetails(@PathVariable("id")int Id){
	  coscholasticAreaCreateService.removeCoscholasticAreaCreateDetails(Id);
    }

}

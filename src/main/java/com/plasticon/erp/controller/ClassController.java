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

import com.plasticon.erp.model.ClassDetails;
import com.plasticon.erp.service.ClassService;



@RestController
@RequestMapping("/classes")

public class ClassController {
	
	@Autowired
	ClassService classService;

	@RequestMapping(value = "/getClassDetails", method = RequestMethod.GET)
	public List<ClassDetails>  getClassData() {
		return classService.getClassDetails();

	}
   
    @PostMapping(value = "/saveClassDetails", consumes = "application/json")
	public void saveClassDetails(@RequestBody ClassDetails cla) {
		classService.saveClassDetails(cla);
	}
		
    @DeleteMapping(value ="/removeclassDetails/{id}")
    public void removeClassDetails(@PathVariable("id")int Id){
	  classService.removeClassDetails(Id);
    }

}

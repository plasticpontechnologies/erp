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

import com.plasticon.erp.model.MenuDetails;
import com.plasticon.erp.model.MessSchedule;
import com.plasticon.erp.service.MenuService;
import com.plasticon.erp.service.MessService;

@RestController
@RequestMapping("/canteen")
public class MessController {
	@Autowired
	MessService messService;

	@RequestMapping(value = "/getMessSchedule", method = RequestMethod.GET)
	public List<MessSchedule>  getMenuData() {
		return messService.getMessSchedule();

	}
	
	  @PostMapping(value = "/saveMessSchedule", consumes = "application/json")
		public void saveMessSchedule(@RequestBody MessSchedule canteen) {
			messService.saveMessSchedule(canteen);

		}
		

		  @DeleteMapping(value ="/removeMessSchedule/{id}")
		    public void removeMessSchedule(@PathVariable("id")int Id){
			  messService.removeMessSchedule(Id);
		    }

}

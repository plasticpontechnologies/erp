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

import com.plasticon.erp.model.Events;
import com.plasticon.erp.model.Holidays;
import com.plasticon.erp.model.HomeWork;
import com.plasticon.erp.service.HolidaysService;

@RestController
@RequestMapping("/holiday")
public class HolidaysController {

	@Autowired
	HolidaysService holidaysService;

	@RequestMapping(value = "/getHolidays", method = RequestMethod.GET)
	public List<Holidays>  getHolidaysData() {
		return holidaysService.getHolidays();

	}
	
	  @PostMapping(value = "/saveHolidays", consumes = "application/json")
		public void saveHolidays(@RequestBody Holidays holiday) {
		  holidaysService.saveHolidays(holiday);

		}
		

	  @DeleteMapping(value ="/removeHolidays/{id}")
	    public void removeHolidays(@PathVariable("id")int Id){
		  holidaysService.removeHolidays(Id);
	    }
	  
}

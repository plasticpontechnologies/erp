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

import com.plasticon.erp.model.AutomaticTimeTable;
import com.plasticon.erp.service.AutomaticTimeTableService;



@RestController
@RequestMapping("/timetable")
public class AutomaticTimeTableController {
	@Autowired
	AutomaticTimeTableService automaticTimeTableService;

	@RequestMapping(value = "/getAutomaticTimeTable", method = RequestMethod.GET)
	public List<AutomaticTimeTable>  getAutomaticTimeTableData() {
		return automaticTimeTableService.getAutomaticTimeTable();

	}
	
	  @PostMapping(value = "/saveAutomaticTimeTable", consumes = "application/json")
		public void saveAutomaticTimeTable(@RequestBody AutomaticTimeTable timetable) {
		  automaticTimeTableService.saveAutomaticTimeTable(timetable);

		}
		

	  @DeleteMapping(value ="/removeAutomaticTimeTable/{id}")
	    public void removeAutomaticTimeTable(@PathVariable("id")int Id){
		  automaticTimeTableService.removeAutomaticTimeTable(Id);
	    }

}

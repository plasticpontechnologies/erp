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

import com.plasticon.erp.model.TimeTableDayWise;
import com.plasticon.erp.service.TimeTableDayWiseService;
@RestController
@RequestMapping("/timetable")
public class TimeTableDayWiseController {
	
		@Autowired
		TimeTableDayWiseService timeTableDayWiseService;

		@RequestMapping(value = "/getTimeTableDayWise", method = RequestMethod.GET)
		public List<TimeTableDayWise>  getTimeTableDayWiseData() {
			return timeTableDayWiseService.getTimeTableDayWise();

		}
		
		  @PostMapping(value = "/saveTimeTableDayWise", consumes = "application/json")
			public void saveTimeTableDayWise(@RequestBody TimeTableDayWise timetable) {
			  timeTableDayWiseService.saveTimeTableDayWise(timetable);

			}
			

			  @DeleteMapping(value ="/removeTimeTableDayWise/{id}")
			    public void removeTimeTableDayWise(@PathVariable("id")int Id){
				  timeTableDayWiseService.removeTimeTableDayWise(Id);
			    }


}

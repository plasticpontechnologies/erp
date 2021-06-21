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

import com.plasticon.erp.model.MessSchedule;
import com.plasticon.erp.model.MySchedule;
import com.plasticon.erp.service.MessService;
import com.plasticon.erp.service.MyScheduleService;
@RestController
@RequestMapping("/timetable")
public class MyScheduleController {
	
		@Autowired
		MyScheduleService myScheduleService;

		@RequestMapping(value = "/getMySchedule", method = RequestMethod.GET)
		public List<MySchedule>  getMyScheduleData() {
			return myScheduleService.getMySchedule();

		}
		
		  @PostMapping(value = "/saveMySchedule", consumes = "application/json")
			public void saveMyScheduleSchedule(@RequestBody MySchedule timetable) {
				myScheduleService.saveMyScheduleSchedule(timetable);

			}
			

			  @DeleteMapping(value ="/removeMySchedule/{id}")
			    public void removeMySchedule(@PathVariable("id")int Id){
				  myScheduleService.removeMySchedule(Id);
			    }


}

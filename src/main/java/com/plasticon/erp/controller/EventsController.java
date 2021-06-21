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

import com.plasticon.erp.model.DishDetails;
import com.plasticon.erp.model.EvaluationExam;
import com.plasticon.erp.model.Events;
import com.plasticon.erp.model.HomeWork;
import com.plasticon.erp.service.EventsService;

@RestController
@RequestMapping("/events")
public class EventsController {

	@Autowired
	EventsService eventsService;
	
	@RequestMapping(value = "/getEvents", method = RequestMethod.GET)
	public List<Events>  getEventsData() {
		return eventsService.getEvents();

	}
	
	  @PostMapping(value = "/saveEvents", consumes = "application/json")
		public void saveEvents(@RequestBody Events events) {
		  eventsService.saveEvents(events);

		}
		

		  @DeleteMapping(value ="/removeEvents/{id}")
		    public void removeEvents(@PathVariable("id")int Id){
			  eventsService.removeEvents(Id);
		    }


	

	
}

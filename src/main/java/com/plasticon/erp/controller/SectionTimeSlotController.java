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

import com.plasticon.erp.model.SectionDetails;
import com.plasticon.erp.model.SectionTimeSlot;
import com.plasticon.erp.service.SectionSevice;
import com.plasticon.erp.service.SectionTimeSlotService;
@RestController
@RequestMapping("/timetable")
public class SectionTimeSlotController {
	
			@Autowired
			SectionTimeSlotService sectionTimeSlotService;

			@RequestMapping(value = "/getSectionTimeSlot", method = RequestMethod.GET)
			public List<SectionTimeSlot>  getSectionTimeSlotData() {
				return sectionTimeSlotService.getSectionTimeSlot();

			}
			
			  @PostMapping(value = "/saveSectionTimeSlot", consumes = "application/json")
				public void saveSectionTimeSlot(@RequestBody SectionTimeSlot timetable) {
					sectionTimeSlotService.saveSectionTimeSlot(timetable);

				}
				

				  @DeleteMapping(value ="/removeSectionTimeSlot/{id}")
				    public void removeSectionTimeSlot(@PathVariable("id")int Id){
					  sectionTimeSlotService.removeSectionTimeSlot(Id);
				    }

}

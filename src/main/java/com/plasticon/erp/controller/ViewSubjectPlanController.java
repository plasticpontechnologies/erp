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

import com.plasticon.erp.model.ViewSubjectPlan;
import com.plasticon.erp.model.ViewTimeTable;
import com.plasticon.erp.service.ViewSubjectPlanService;
import com.plasticon.erp.service.ViewTimeTableService;
@RestController
@RequestMapping("/timetable")
public class ViewSubjectPlanController {
	
			@Autowired
			ViewSubjectPlanService viewSubjectPlanService;

			@RequestMapping(value = "/getViewSubjectPlan", method = RequestMethod.GET)
			public List<ViewSubjectPlan>  getViewSubjectPlanData() {
				return viewSubjectPlanService.getViewSubjectPlan();

			}
			
			  @PostMapping(value = "/saveViewSubjectPlan", consumes = "application/json")
				public void saveViewSubjectPlan(@RequestBody ViewSubjectPlan timetable) {
					viewSubjectPlanService.saveViewSubjectPlan(timetable);

				}
				

				  @DeleteMapping(value ="/removeViewSubjectPlan/{id}")
				    public void removeViewSubjectPlan(@PathVariable("id")int Id){
					  viewSubjectPlanService.removeViewSubjectPlan(Id);
				    }

}

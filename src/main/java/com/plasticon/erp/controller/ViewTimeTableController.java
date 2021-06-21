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

import com.plasticon.erp.model.ViewMenu;
import com.plasticon.erp.model.ViewTimeTable;
import com.plasticon.erp.service.ViewMenuService;
import com.plasticon.erp.service.ViewTimeTableService;
@RestController
@RequestMapping("/timetable")
public class ViewTimeTableController {
	
		@Autowired
		ViewTimeTableService viewTimeTableService;

		@RequestMapping(value = "/getViewTimeTable", method = RequestMethod.GET)
		public List<ViewTimeTable>  getViewTimeTableData() {
			return viewTimeTableService.getViewTimeTable();

		}
		
		  @PostMapping(value = "/saveViewTimeTable", consumes = "application/json")
			public void saveViewTimeTable(@RequestBody ViewTimeTable timetable) {
				viewTimeTableService.saveViewTimeTable(timetable);

			}
			

			  @DeleteMapping(value ="/removeViewTimeTable/{id}")
			    public void removeViewTimeTable(@PathVariable("id")int Id){
				  viewTimeTableService.removeViewTimeTable(Id);
			    }
		

}

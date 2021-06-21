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

import com.plasticon.erp.model.HomeWork;
import com.plasticon.erp.service.HomeWorkService;




@RestController
@RequestMapping("/homework")
public class HomeWorkController {

	
		@Autowired
		HomeWorkService homeWorkService;

		@RequestMapping(value = "/getHomeWork", method = RequestMethod.GET)
		public List<HomeWork>  getHomeWorkData() {
			return homeWorkService.getHomeWork();

		}
		
		  @PostMapping(value = "/saveHomeWork", consumes = "application/json")
			public void saveHomeWork(@RequestBody HomeWork homework) {
			  homeWorkService.saveHomeWork(homework);

			}
			

		  @DeleteMapping(value ="/removeHomeWork/{id}")
		    public void removeHomeWork(@PathVariable("id")int Id){
			  homeWorkService.removeHomeWork(Id);
		    }
		  
	
}

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

import com.plasticon.erp.service.ViewMenuService;

@RestController
@RequestMapping("/canteen")
public class ViewMenuController {
	@Autowired
	ViewMenuService viewMenuService;

	@RequestMapping(value = "/getViewMenu", method = RequestMethod.GET)
	public List<ViewMenu>  getViewData() {
		return viewMenuService.getViewMenu();

	}
	
	  @PostMapping(value = "/saveViewMenu", consumes = "application/json")
		public void saveViewMenu(@RequestBody ViewMenu canteen) {
			viewMenuService.saveViewMenu(canteen);

		}
		

		  @DeleteMapping(value ="/removeViewMenu/{id}")
		    public void removeViewMenu(@PathVariable("id")int Id){
			  viewMenuService.removeViewMenu(Id);
		    }
	

}

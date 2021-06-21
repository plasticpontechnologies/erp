package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.MenuTypeDetails;
import com.plasticon.erp.service.MenuTypeService;


@RestController
@RequestMapping("/canteen")
public class MenuTypeController {
	@Autowired
	MenuTypeService menuTypeService;

	@RequestMapping(value = "/getMenuTypeDetails", method = RequestMethod.GET)
	public List<MenuTypeDetails>  getMenuTypeData() {
		return menuTypeService.getMenuTypeDetails();

	}
	

}

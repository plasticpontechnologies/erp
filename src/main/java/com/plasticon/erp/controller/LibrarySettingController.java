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

import com.plasticon.erp.model.LibrarySetting;
import com.plasticon.erp.model.MenuDetails;
import com.plasticon.erp.service.LibrarySettingService;

@RestController
@RequestMapping("/library")
public class LibrarySettingController {

	@Autowired
	LibrarySettingService librarysettingService;
	
	
	@RequestMapping(value = "/getLibraryDetails", method = RequestMethod.GET)
	public List<LibrarySetting>  getLibrarySettingData() {
		return librarysettingService.getLibrarySettingDetails();

	}
	
	  @PostMapping(value = "/saveLibraryDetails", consumes = "application/json")
		public void saveLibrarySettingDetails(@RequestBody LibrarySetting library) {
		  librarysettingService.saveLibrarySettingDetails(library);

		}
		

		  @DeleteMapping(value ="/removeLibraryDetails/{id}")
		    public void removeLibrarySettingDetails(@PathVariable("id")int Id){
			  librarysettingService.removeLibrarySettingDetails(Id);
		    }

}

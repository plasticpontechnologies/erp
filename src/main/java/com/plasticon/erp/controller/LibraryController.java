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

import com.plasticon.erp.model.LibraryDetails;
import com.plasticon.erp.service.LibraryService;



@RestController
@RequestMapping("/Lib")
public class LibraryController {
	@Autowired
	LibraryService libraryService;

	@RequestMapping(value = "/getLibraryDetails", method = RequestMethod.GET)
	public List<LibraryDetails>  getLibraryData() {
		return libraryService.getLibraryDetails();

	}
	
	  @PostMapping(value = "/saveLibraryDetails", consumes = "application/json")
		public void saveLibraryDetails(@RequestBody LibraryDetails lib) {
			libraryService.saveLibraryDetails(lib);

		}
		

		  @DeleteMapping(value ="/removeLibraryDetails/{id}")
		    public void removeLibraryDetails(@PathVariable("id")int Id){
			  libraryService.removeLibraryDetails(Id);
		    }

}

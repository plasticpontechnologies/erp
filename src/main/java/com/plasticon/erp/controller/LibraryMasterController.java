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

import com.plasticon.erp.model.LibraryMaster;
import com.plasticon.erp.model.NewBook;
import com.plasticon.erp.service.LibraryMasterService;

@RestController
@RequestMapping("/master")
public class LibraryMasterController {
	
	@Autowired
	LibraryMasterService librarymasterService;
	
	@RequestMapping(value = "/getLibraryMasterDetails", method = RequestMethod.GET)
	public List<LibraryMaster>  getLibraryMasterData() {
		return librarymasterService.getLibraryMaster();

	}
	
	  @PostMapping(value = "/saveLibraryMasterDetails", consumes = "application/json")
		public void saveLibraryMaster(@RequestBody LibraryMaster newbook) {
		  librarymasterService.saveLibraryMaster(newbook);

		}
		

		  @DeleteMapping(value ="/removeLibraryMasterDetails/{id}")
		    public void removeLibraryMaster(@PathVariable("id")int Id){
			  librarymasterService.removeLibraryMaster(Id);
		    }



}

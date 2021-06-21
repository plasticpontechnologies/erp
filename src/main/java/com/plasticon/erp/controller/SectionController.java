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
import com.plasticon.erp.model.SectionDetails;
import com.plasticon.erp.service.LibraryService;
import com.plasticon.erp.service.SectionSevice;
@RestController
@RequestMapping("/Sec")
public class SectionController {
	
		@Autowired
		SectionSevice sectionService;

		@RequestMapping(value = "/getSectionDetails", method = RequestMethod.GET)
		public List<SectionDetails>  getSectionData() {
			return sectionService.getSectionDetails();

		}
		
		  @PostMapping(value = "/saveSectionDetails", consumes = "application/json")
			public void saveSectionDetails(@RequestBody SectionDetails lib) {
				sectionService.saveSectionDetails(lib);

			}
			

			  @DeleteMapping(value ="/removeSectionDetails/{id}")
			    public void removeSectionDetails(@PathVariable("id")int Id){
				  sectionService.removeSectionDetails(Id);
			    }

}

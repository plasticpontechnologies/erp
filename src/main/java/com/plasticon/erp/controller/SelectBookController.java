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

import com.plasticon.erp.model.NewBook;
import com.plasticon.erp.model.SelectBook;
import com.plasticon.erp.service.SelectBookService;

@RestController
@RequestMapping("/select")
public class SelectBookController {

	@Autowired
	SelectBookService selectbookService;
	
	@RequestMapping(value = "/getSelectBookDetails", method = RequestMethod.GET)
	public List<SelectBook>  getSelectBookData() {
		return selectbookService.getSelectBook();

	}
	
	  @PostMapping(value = "/saveSelectBookDetails", consumes = "application/json")
		public void saveSelectBook(@RequestBody SelectBook select) {
		  selectbookService.saveSelectBook(select);

		}
		

		  @DeleteMapping(value ="/removSelectBook/{id}")
		    public void removeSelectBook(@PathVariable("id")int Id){
			  selectbookService.removeSelectBook(Id);
		    }


	
}

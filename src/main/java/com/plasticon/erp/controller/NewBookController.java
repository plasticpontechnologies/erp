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

import com.plasticon.erp.model.BookList;
import com.plasticon.erp.model.NewBook;
import com.plasticon.erp.service.NewBookService;

@RestController
@RequestMapping("/newbook")
public class NewBookController {

	@Autowired
	NewBookService newbookService;
	
	@RequestMapping(value = "/getNewBookDetails", method = RequestMethod.GET)
	public List<NewBook>  getNewBookData() {
		return newbookService.getNewBook();

	}
	
	  @PostMapping(value = "/saveNewBookDetails", consumes = "application/json")
		public void saveNewBook(@RequestBody NewBook newbook) {
		  newbookService.saveNewBook(newbook);

		}
		

		  @DeleteMapping(value ="/removeNewBook/{id}")
		    public void removeNewBook(@PathVariable("id")int Id){
			  newbookService.removeNewBook(Id);
		    }


}

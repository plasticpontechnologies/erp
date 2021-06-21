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

import com.plasticon.erp.model.AddBook;
import com.plasticon.erp.model.BookList;
import com.plasticon.erp.model.CanteenMasterEntry;
import com.plasticon.erp.model.Questions;
import com.plasticon.erp.service.AddBookService;

@RestController
@RequestMapping("/addbook")
public class AddBookController {

	@Autowired
	AddBookService addbookService;
	
	@RequestMapping(value = "/getAddBookDetails", method = RequestMethod.GET)
	public List<AddBook>  getAddBookData() {
		return addbookService.getAddBook();

	}
	
	  @PostMapping(value = "/saveAddBookDetails", consumes = "application/json")
		public void saveAddBook(@RequestBody AddBook addbook) {
		  addbookService.saveAddBook(addbook);

		}
		

		  @DeleteMapping(value ="/removeAddBook/{id}")
		    public void removeAddBook(@PathVariable("id")int Id){
			  addbookService.removeAddBook(Id);
		    }



	
	
	

}

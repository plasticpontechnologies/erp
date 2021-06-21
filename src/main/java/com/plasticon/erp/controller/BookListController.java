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
import com.plasticon.erp.model.Message;
import com.plasticon.erp.service.BookListService;

@RestController
@RequestMapping("/list")
public class BookListController {

	@Autowired
	BookListService booklistService;
	
	@RequestMapping(value = "/getBookListDetails", method = RequestMethod.GET)
	public List<BookList>  getBookListData() {
		return booklistService.getBookList();

	}
	
	  @PostMapping(value = "/saveBookListDetails", consumes = "application/json")
		public void saveBookList(@RequestBody BookList list) {
		  booklistService.saveBookList(list);

		}
		

		  @DeleteMapping(value ="/removeBookList/{id}")
		    public void removeBookList(@PathVariable("id")int Id){
			  booklistService.removeBookList(Id);
		    }


}

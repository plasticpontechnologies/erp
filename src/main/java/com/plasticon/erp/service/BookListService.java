package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.BookList;
import com.plasticon.erp.model.Message;
import com.plasticon.erp.repository.BookListRepository;

@Service
public class BookListService {
	
	@Autowired
	BookListRepository booklistRepository;
	
	public List<BookList> getBookList() {
		return booklistRepository.findAll();

	}

	public void saveBookList(BookList list) {
		booklistRepository.save(list);
		

	}
	@Transactional
	public void removeBookList(int id) {
		booklistRepository.deleteById(id);
	}
	

}

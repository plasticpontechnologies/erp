package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.BookList;
import com.plasticon.erp.model.NewBook;
import com.plasticon.erp.repository.NewBookRepository;

@Service
public class NewBookService {

	@Autowired
	NewBookRepository newbookRepository;
	
	public List<NewBook> getNewBook() {
		return newbookRepository.findAll();

	}

	public void saveNewBook(NewBook newbook) {
		newbookRepository.save(newbook);
		

	}
	@Transactional
	public void removeNewBook(int id) {
		newbookRepository.deleteById(id);
	}

}

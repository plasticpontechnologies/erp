package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.AddBook;
import com.plasticon.erp.model.BookList;
import com.plasticon.erp.model.Questions;
// import com.plasticon.erp.model.CanteenMasterEntry;
import com.plasticon.erp.repository.AddBookRepository;

@Service
public class AddBookService {

	@Autowired
	AddBookRepository addbookRepository;
	
	public List<AddBook> getAddBook() {
		return addbookRepository.findAll();

	}

	public void saveAddBook(AddBook addbook) {
		addbookRepository.save(addbook);
		

	}
	@Transactional
	public void removeAddBook(int id) {
		addbookRepository.deleteById(id);
	}

	}


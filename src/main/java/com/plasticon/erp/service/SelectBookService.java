package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.NewBook;
import com.plasticon.erp.model.SelectBook;
import com.plasticon.erp.repository.SelectBookRepository;

@Service
public class SelectBookService {

	@Autowired
	SelectBookRepository selectbookRepository;
	
	public List<SelectBook> getSelectBook() {
		return selectbookRepository.findAll();

	}

	public void saveSelectBook(SelectBook select) {
		selectbookRepository.save(select);
		

	}
	@Transactional
	public void removeSelectBook(int id) {
		selectbookRepository.deleteById(id);
	}

}

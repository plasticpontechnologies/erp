package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Category;
import com.plasticon.erp.model.Category;
import com.plasticon.erp.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> getCategory() {
		return categoryRepository.findAll();

	}

	public void saveCategory(Category category) {
		categoryRepository.save(category);
	}

	@Transactional
	public void removeCategory(int id) {
		categoryRepository.deleteById(id);
	}
	


}

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

import com.plasticon.erp.model.Category;
import com.plasticon.erp.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "/getCategoryDetails", method = RequestMethod.GET)
	public List<Category> getCategory() {
		return categoryService.getCategory();

	}

	@PostMapping(value = "/saveCategoryDetails", consumes = "application/json")
	public void saveCategory(@RequestBody Category category) {
		categoryService.saveCategory(category);

	}

	@DeleteMapping(value = "/removeCategory/{id}")
	public void removeCategory(@PathVariable("id") int Id) {
		categoryService.removeCategory(Id);
	}

}

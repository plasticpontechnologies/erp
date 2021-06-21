package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.MenuTypeDetails;
import com.plasticon.erp.repository.MenuTypeRepository;


@Service
public class MenuTypeService {
	@Autowired
	MenuTypeRepository menuTypeRepository;
		public List<MenuTypeDetails> getMenuTypeDetails() {
			return menuTypeRepository.findAll();
		}

}

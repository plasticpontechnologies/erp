package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.plasticon.erp.model.ViewMenu;

import com.plasticon.erp.repository.ViewMenuRepository;

@Service
public class ViewMenuService {
	@Autowired
	ViewMenuRepository viewMenuRepository;
		public List<ViewMenu> getViewMenu() {
			return viewMenuRepository.findAll();

		}

		public void saveViewMenu(ViewMenu canteen) {
			viewMenuRepository.save(canteen);
			

		}
		@Transactional
		public void removeViewMenu(int id) {
			viewMenuRepository.deleteById(id);
		}
	

}

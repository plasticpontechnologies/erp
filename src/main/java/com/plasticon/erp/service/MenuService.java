package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.MenuDetails;
import com.plasticon.erp.model.MessSchedule;
import com.plasticon.erp.repository.MenuRepository;


@Service
public class MenuService {
	@Autowired
	MenuRepository menuRepository;
		public List<MenuDetails> getMenuDetails() {
			return menuRepository.findAll();

		}

		public void saveMenuDetails(MenuDetails canteen) {
			menuRepository.save(canteen);
			

		}
		@Transactional
		public void removeMenuDetails(int id) {
			menuRepository.deleteById(id);
		}
		public List<MenuDetails> findDishesByName(String mName) {
			return	menuRepository.findDishesByMenuName(mName);
			}

}

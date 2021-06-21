package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.DishDetails;
import com.plasticon.erp.repository.DishRepository;

@Service
public class DishService {
	@Autowired
	DishRepository dishRepository;
		public List<DishDetails> getDishDetails() {
			return dishRepository.findAll();

		}

		public void saveDishDetails(DishDetails canteen) {
			dishRepository.save(canteen);
			

		}
		@Transactional
		public void removeDishDetails(int id) {
			dishRepository.deleteById(id);
		}


}

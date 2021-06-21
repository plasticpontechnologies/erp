package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.MenuDetails;
import com.plasticon.erp.model.MessSchedule;
import com.plasticon.erp.repository.MenuRepository;
import com.plasticon.erp.repository.MessRepository;

@Service
public class MessService {
	@Autowired
	MessRepository messRepository;
		public List<MessSchedule> getMessSchedule() {
			return messRepository.findAll();

		}

		public void saveMessSchedule(MessSchedule canteen) {
			messRepository.save(canteen);
			

		}
		@Transactional
		public void removeMessSchedule(int id) {
			messRepository.deleteById(id);
		}
	

}

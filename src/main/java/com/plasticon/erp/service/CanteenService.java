package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.CanteenMasterEntry;
import com.plasticon.erp.model.LibraryDetails;
import com.plasticon.erp.repository.CanteenRepository;
import com.plasticon.erp.repository.LibraryRepository;
@Service
public class CanteenService {
	@Autowired
	CanteenRepository canteenRepository;
		public List<CanteenMasterEntry> getCanteenMasterEntry() {
			return canteenRepository.findAll();

		}

		public void saveCanteenMasterEntry(CanteenMasterEntry canteen) {
			canteenRepository.save(canteen);
			

		}
		@Transactional
		public void removeCanteenMasterEntry(int id) {
			canteenRepository.deleteById(id);
		}


}

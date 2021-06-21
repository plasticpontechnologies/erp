package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Purpose;
import com.plasticon.erp.repository.PurposeRepository;

@Service
public class PurposeService {
	@Autowired
	PurposeRepository purposeRepository;
	
		public List<Purpose> getPurpose() {
			return purposeRepository.findAll();

		}
		public void savePurpose(Purpose MasterEntry) {
			purposeRepository.save(MasterEntry);
			
		

		}
		@Transactional
		public void removePurpose(int id) {
			purposeRepository.deleteById(id);
		}

}

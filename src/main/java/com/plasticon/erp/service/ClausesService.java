package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ClausesDetails;
import com.plasticon.erp.repository.ClausesRepository;



@Service
public class ClausesService {
	@Autowired
	ClausesRepository clausesRepository;
		public List<ClausesDetails> getClausesDetails() {
			return clausesRepository.findAll();

		}
		public void saveClausesDetails(ClausesDetails MasterEntry) {
			clausesRepository.save(MasterEntry);
			
		

		}
		@Transactional
		public void removeClausesDetails(int id) {
			clausesRepository.deleteById(id);
		}
	

}

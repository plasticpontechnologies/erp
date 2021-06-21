package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Reference;
import com.plasticon.erp.repository.ReferenceRepository;

@Service
public class ReferenceService {
	@Autowired
	ReferenceRepository referenceRepository;
	
		public List<Reference> getReference() {
			return referenceRepository.findAll();

		}
		public void saveReference(Reference MasterEntry) {
			referenceRepository.save(MasterEntry);
			
		

		}
		@Transactional
		public void removeReference(int id) {
			referenceRepository.deleteById(id);
		}

}

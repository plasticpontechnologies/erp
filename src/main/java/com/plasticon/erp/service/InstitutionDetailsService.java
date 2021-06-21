package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.InstitutionDetails;

import com.plasticon.erp.repository.InstitutionDetailsRepository;


@Service
public class InstitutionDetailsService {
	
		@Autowired
		InstitutionDetailsRepository institutionDetailsRepository;
			public List<InstitutionDetails> getInstitutionDetails() {
				return institutionDetailsRepository.findAll();

			}

			public void saveInstitutionDetails(InstitutionDetails MasterEntry) {
				institutionDetailsRepository.save(MasterEntry);
				

			}
			@Transactional
			public void removeInstitutionDetails(int id) {
				institutionDetailsRepository.deleteById(id);
			}
	

}

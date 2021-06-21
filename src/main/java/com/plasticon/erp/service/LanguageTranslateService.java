package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.plasticon.erp.model.LanguageTranslate;

import com.plasticon.erp.repository.LanguageTranslateRepository;

@Service
public class LanguageTranslateService {
	
		@Autowired
		LanguageTranslateRepository languageTranslateRepository;
			public List<LanguageTranslate> getLanguageTranslate() {
				return languageTranslateRepository.findAll();

			}

			public void saveLanguageTranslate(LanguageTranslate MasterEntry) {
				languageTranslateRepository.save(MasterEntry);
				

			}
			@Transactional
			public void removeLanguageTranslate(int id) {
				languageTranslateRepository.deleteById(id);
			}
	

}

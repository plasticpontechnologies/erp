package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Language;

import com.plasticon.erp.repository.LanguageRepository;


@Service
public class LanguageService {
	@Autowired
	LanguageRepository languageRepository;
		public List<Language> getLanguage() {
			return languageRepository.findAll();

		}

		public void saveLanguage(Language MasterEntry) {
			languageRepository.save(MasterEntry);
			

		}
		@Transactional
		public void removeLanguage(int id) {
			languageRepository.deleteById(id);
		}

}

package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.CertificateStudentDetailsSettings;
import com.plasticon.erp.repository.CertificateStudentDetailsSettingsRepository;



@Service
public class CertificateStudentDetailsSettingsService {
	@Autowired
	CertificateStudentDetailsSettingsRepository certificateStudentDetailsSettingsRepository;
		public List<CertificateStudentDetailsSettings> getCertificateStudentDetailsSettings() {
			return certificateStudentDetailsSettingsRepository.findAll();

		}
		public void saveCertificateStudentDetailsSettings(CertificateStudentDetailsSettings MasterEntry) {
			certificateStudentDetailsSettingsRepository.save(MasterEntry);
			
		

		}
		@Transactional
		public void removeCertificateStudentDetailsSettings(int id) {
			certificateStudentDetailsSettingsRepository.deleteById(id);
		}

}

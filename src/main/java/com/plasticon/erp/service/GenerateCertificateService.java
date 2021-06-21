package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.GenerateCertificate;
import com.plasticon.erp.repository.GenerateCertificateRepository;

@Service
public class GenerateCertificateService {
	@Autowired
	GenerateCertificateRepository generateCertificateRepository;
	
	public List<GenerateCertificate> getGenerateCertificate() {
		return generateCertificateRepository.findAll();

	}

	public void saveGenerateCertificate(GenerateCertificate generateCertificate) {
		generateCertificateRepository.save(generateCertificate);
	}

	@Transactional
	public void removeGenerateCertificate(int id) {
		generateCertificateRepository.deleteById(id);
	}

	

}

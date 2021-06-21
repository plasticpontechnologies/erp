package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.UploadResultEntryScholasticDetails;
import com.plasticon.erp.repository.UploadResultEntryScholasticRepository;



@Service
public class UploadResultEntryScholasticService {

	@Autowired
	UploadResultEntryScholasticRepository uploadResultEntryScholasticRepository;

	public List<UploadResultEntryScholasticDetails> getUploadResultEntryScholasticDetails() {
		return uploadResultEntryScholasticRepository.findAll();
	}
	 

	public void saveUploadResultEntryScholasticDetails(UploadResultEntryScholasticDetails ures) {
		uploadResultEntryScholasticRepository.save(ures);
	}

	@Transactional
	public void removeUploadResultEntryScholasticDetails(int id) {
		uploadResultEntryScholasticRepository.deleteById(id);
	}
}

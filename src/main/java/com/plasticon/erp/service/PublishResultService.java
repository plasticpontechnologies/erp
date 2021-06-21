package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.PublishResultDetails;
import com.plasticon.erp.repository.PublishResultRepository;

@Service
public class PublishResultService {

	@Autowired
	PublishResultRepository publishResultRepository;
	public List<PublishResultDetails> getPublishResultDetails() {
		return publishResultRepository.findAll();

	}

	public void savePublishResultDetails(PublishResultDetails publishresult) {
		publishResultRepository.save(publishresult);
	}

	@Transactional
	public void removePublishResultDetails(int id) {
		publishResultRepository.deleteById(id);
	}
}

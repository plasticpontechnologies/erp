package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Document;
import com.plasticon.erp.repository.DocumentRepository;

@Service
public class DocumentService {
	@Autowired
	DocumentRepository documentRepository;
	
	public List<Document> getDocument() {
		return documentRepository.findAll();

	}

	public void saveDocument(Document document) {
		documentRepository.save(document);
	}

	@Transactional
	public void removeDocument(int id) {
		documentRepository.deleteById(id);
	}

}

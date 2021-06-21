package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.DocumentList;
import com.plasticon.erp.repository.DocumentListRepository;

@Service
public class DocumentListService {
	@Autowired
	private DocumentListRepository documentListRepository;

	public List<DocumentList> getDocumentList() {
		return documentListRepository.findAll();

	}

	public void saveDocumentList(DocumentList documentList) {
		documentListRepository.save(documentList);
	}

	@Transactional
	public void removeDocumentList(int id) {
		documentListRepository.deleteById(id);
	}

}

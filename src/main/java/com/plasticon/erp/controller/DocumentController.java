package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.Document;
import com.plasticon.erp.service.DocumentService;

@RestController
@RequestMapping("/document")
public class DocumentController {
	
	@Autowired
	DocumentService documentService;
	
	@RequestMapping(value = "/getDocument", method = RequestMethod.GET)
	public List<Document> getDocument() {
		return documentService.getDocument();

	}

	@PostMapping(value = "/saveDocument", consumes = "application/json")
	public void saveDocument(@RequestBody Document document) {
		documentService.saveDocument(document);

	}

	@DeleteMapping(value = "/removeDocument/{id}")
	public void removeDocument(@PathVariable("id") int Id) {
		documentService.removeDocument(Id);
	}
}

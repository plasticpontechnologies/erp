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

import com.plasticon.erp.model.DocumentList;
import com.plasticon.erp.service.DocumentListService;

@RestController
@RequestMapping("/documentlist")
public class DocumentListController {
	@Autowired
	private DocumentListService documentListService;

	@RequestMapping(value = "/getDocumentListDetails", method = RequestMethod.GET)
	public List<DocumentList> getDocumentList() {
		return documentListService.getDocumentList();

	}

	@PostMapping(value = "/saveDocumentListDetails", consumes = "application/json")
	public void saveDocumentList(@RequestBody DocumentList documentList) {
		documentListService.saveDocumentList(documentList);

	}

	@DeleteMapping(value = "/removeDocumentList/{id}")
	public void removeDocumentList(@PathVariable("id") int Id) {
		documentListService.removeDocumentList(Id);
	}
}

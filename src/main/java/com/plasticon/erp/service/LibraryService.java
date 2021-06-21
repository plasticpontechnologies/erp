package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.LibraryDetails;
import com.plasticon.erp.repository.LibraryRepository;

@Service
public class LibraryService {
	@Autowired
	LibraryRepository libraryRepository;
		public List<LibraryDetails> getLibraryDetails() {
			return libraryRepository.findAll();

		}

		public void saveLibraryDetails(LibraryDetails lib) {
			libraryRepository.save(lib);
			

		}
		@Transactional
		public void removeLibraryDetails(int id) {
			libraryRepository.deleteById(id);
		}

}

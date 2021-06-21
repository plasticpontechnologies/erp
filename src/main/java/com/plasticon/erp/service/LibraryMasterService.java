package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.LibraryMaster;
import com.plasticon.erp.model.NewBook;
import com.plasticon.erp.repository.LibraryMasterRepository;

@Service
public class LibraryMasterService {

	@Autowired
	LibraryMasterRepository librarymasterRepository;
	
	public List<LibraryMaster> getLibraryMaster() {
		return librarymasterRepository.findAll();

	}

	public void saveLibraryMaster(LibraryMaster master) {
		librarymasterRepository.save(master);
		

	}
	@Transactional
	public void removeLibraryMaster(int id) {
		librarymasterRepository.deleteById(id);
	}

}

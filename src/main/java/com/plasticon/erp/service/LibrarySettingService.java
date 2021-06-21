package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.LibrarySetting;
import com.plasticon.erp.model.MenuDetails;
import com.plasticon.erp.repository.LibrarySettingRepository;

@Service
public class LibrarySettingService {

	
	@Autowired
	LibrarySettingRepository librarysettingRepository;
	
	public List<LibrarySetting> getLibrarySettingDetails() {
		return librarysettingRepository.findAll();

	}

	public void saveLibrarySettingDetails(LibrarySetting library) {
		librarysettingRepository.save(library);
		

	}
	@Transactional
	public void removeLibrarySettingDetails(int id) {
		librarysettingRepository.deleteById(id);
	}
}

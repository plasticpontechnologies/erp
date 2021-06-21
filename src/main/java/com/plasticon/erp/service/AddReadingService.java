package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.AddReading;
import com.plasticon.erp.repository.AddReadingRepository;

@Service
public class AddReadingService {
@Autowired
AddReadingRepository  addReadingRepository;

public List<AddReading> getAddReadingDetails(){
	return addReadingRepository.findAll();
	}
public void saveAddReadingDetails(AddReading addReading) {
	addReadingRepository.save(addReading);
}
public void deleteAddReadingDetailsById(int readingId) {
	addReadingRepository.deleteById(readingId);
}
}

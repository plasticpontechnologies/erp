package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.AddStop;
import com.plasticon.erp.repository.AddStopRepository;

@Service
public class AddStopService {
@Autowired
AddStopRepository addStopRepository;

public List<AddStop> getAddStopDetails(){
	return addStopRepository.findAll();
	}
public void saveAddStopDetails(AddStop addStop) {
	addStopRepository.save(addStop);
}
public void deleteAddStopDetailsById(int stopId) {
	addStopRepository.deleteById(stopId);
}
}

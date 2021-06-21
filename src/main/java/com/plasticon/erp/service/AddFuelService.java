package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.AddFuel;
import com.plasticon.erp.repository.AddFuelRepository;

@Service
public class AddFuelService {
@Autowired
AddFuelRepository addFuelRepository;


public List<AddFuel> getAddFuelDetails(){
	return addFuelRepository.findAll();
	}
public void saveAddFuelDetails(AddFuel addFuel) {
	addFuelRepository.save(addFuel);
}
public void deleteAddFuelDetailsById(int fuelId) {
	addFuelRepository.deleteById(fuelId);
}
}

package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.AddVehicle;
import com.plasticon.erp.repository.AddVehicleRepository;

@Service
public class AddVehicleService {
@Autowired
AddVehicleRepository addVehicleRepository;

public List<AddVehicle> getAddVehicleDetails(){
	return addVehicleRepository.findAll();
	}
public void saveAddVehicleDetails(AddVehicle addVehicle) {
	addVehicleRepository.save(addVehicle);
}
public void deleteAddVehicleDetailsById(int addVehicleId) {
	addVehicleRepository.deleteById(addVehicleId);
}
}

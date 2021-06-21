package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.TransportCoordinator;
import com.plasticon.erp.repository.TransportCoordinatorRepository;
@Service
public class TransportCoordinatorService {
@Autowired
TransportCoordinatorRepository transportCoordinatorRepository;

public List<TransportCoordinator> getTransportCoordinatorDetails(){
	return transportCoordinatorRepository.findAll();
	}
public void saveTransportCoordinatorDetails(TransportCoordinator transportCoordinator) {
	transportCoordinatorRepository.save(transportCoordinator);
}
public void deleteTransportCoordinatorDetailsById(int coordinatorId) {
	transportCoordinatorRepository.deleteById(coordinatorId);
}
}

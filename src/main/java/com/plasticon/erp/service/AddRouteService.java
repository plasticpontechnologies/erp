package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.AddRoute;
import com.plasticon.erp.repository.AddRouteRepository;

@Service
public class AddRouteService {
@Autowired
AddRouteRepository addRouteRepository;

public List<AddRoute> getAddRouteDetails(){
	return addRouteRepository.findAll();
	}
public void saveAddRouteDetails(AddRoute addRoute) {
	addRouteRepository.save(addRoute);
}
public void deleteAddRouteDetailsById(int routeId) {
	addRouteRepository.deleteById(routeId);
}
}

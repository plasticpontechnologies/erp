package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.RouteTo;
import com.plasticon.erp.repository.RouteToRepository;

@Service
public class RouteToService {
@Autowired
RouteToRepository routeToRepository;


public List<RouteTo> getRouteToDetails(){
	return routeToRepository.findAll();
	}
public void saveRouteToDetails(RouteTo routeTo) {
	routeToRepository.save(routeTo);
}
public void deleteRouteToDetailsById(int routeId) {
	routeToRepository.deleteById(routeId);
}
}

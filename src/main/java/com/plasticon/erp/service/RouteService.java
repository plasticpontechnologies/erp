package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.EnquiryMessage;
import com.plasticon.erp.model.SmsToRoute;
import com.plasticon.erp.repository.RouteRepository;

@Service
public class RouteService {

	@Autowired
	public RouteRepository routeRepository;
	
	public List<SmsToRoute> getSmsToRoute() {
		return routeRepository.findAll();

	}
	public void saveSmsToRoute(SmsToRoute routesms) {
		routeRepository.save(routesms);
			}
	
	@Transactional
	public void removeSmsToRoute(int id) {
		routeRepository.deleteById(id);
	}
}


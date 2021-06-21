package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.RouteDetails;
import com.plasticon.erp.repository.RouteDetailsRepository;

@Service
public class RouteDetailsService {
	@Autowired
	RouteDetailsRepository routeDetailsRepository;
	
		public List<RouteDetails> getRouteDetails() {
			return routeDetailsRepository.findAll();

		}
		public void saveRouteDetails(RouteDetails Transport) {
			routeDetailsRepository.save(Transport);
			
		

		}
		@Transactional
		public void removeRouteDetails(int id) {
			routeDetailsRepository.deleteById(id);
		}

}

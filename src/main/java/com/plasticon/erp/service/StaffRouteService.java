package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StaffRoute;
import com.plasticon.erp.repository.StaffRouteRepository;

@Service
public class StaffRouteService {
@Autowired
StaffRouteRepository staffRouteRepository;

public List<StaffRoute> getStaffRouteDetails(){
	return staffRouteRepository.findAll();
	}
public void saveStaffRouteDetails(StaffRoute staffRoute) {
	staffRouteRepository.save(staffRoute);
}
public void deleteStaffRouteDetailsById(int staffRouteId) {
	staffRouteRepository.deleteById(staffRouteId);
}
}

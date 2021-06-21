package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.City;
import com.plasticon.erp.repository.CityRepository;

@Service
public class CityService {
	
	@Autowired
	CityRepository cityRepository;
	
	public List<City> getCity() {
		return cityRepository.findAll();
	}
	
	public void saveCity(City city) {
		cityRepository.save(city);
	}

}

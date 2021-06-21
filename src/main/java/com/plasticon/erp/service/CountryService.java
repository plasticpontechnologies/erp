package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Country;
import com.plasticon.erp.repository.CountryRepository;

@Service
public class CountryService {

	@Autowired
	CountryRepository countryRepository;

	public List<Country> getCountry() {
		return countryRepository.findAll();

	}

	public void saveCountry(Country country) {
		countryRepository.save(country);
	}

	public List<Country> getStateDetails(int id) {
		return countryRepository.findByCountryId(id);
	}

}
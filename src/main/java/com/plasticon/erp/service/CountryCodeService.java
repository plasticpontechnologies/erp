package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.CountryCode;
import com.plasticon.erp.repository.CountryCodeRepository;

@Service
public class CountryCodeService {
	
	@Autowired
	CountryCodeRepository countryCodeRepository;
	
    public List<CountryCode> getCountryCode() {
    	return countryCodeRepository.findAll();
    }
    
    public void savecountryCode(CountryCode countrycode) {
    	countryCodeRepository.save(countrycode);
    }
}

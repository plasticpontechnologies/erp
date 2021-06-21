package com.plasticon.erp.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.LogoAndSocial;
import com.plasticon.erp.repository.LogoAndSocialRepository;



@Service
public class LogoAndSocialService {
	
	@Autowired
	LogoAndSocialRepository logoAndSocialRepository;
	
	
	
    public List<LogoAndSocial> getLogoAndSocial() {
		return logoAndSocialRepository.findAll();
    }
    
    public void saveLogoAndSocialRepository(LogoAndSocial logoandsocial) {
    	logoAndSocialRepository.save(logoandsocial);
    }
    
    @Transactional
    public void removeLogoAndSocial(int id) {
    	logoAndSocialRepository.deleteById(id);
    }
}

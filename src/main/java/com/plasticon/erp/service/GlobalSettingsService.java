package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.GlobalSettings;
import com.plasticon.erp.repository.GlobalSettingsRepository;

@Service
public class GlobalSettingsService {
	@Autowired
	GlobalSettingsRepository globalSettingsRepository;
	public List<GlobalSettings> getGlobalSettings() {
		return globalSettingsRepository.findAll();
	}
	
	public void saveGlobalSettings(GlobalSettings globalSettings) {
		globalSettingsRepository.save(globalSettings);
	}
	
	@Transactional
	public void removeGlobalSettings(int Id) {
		globalSettingsRepository.deleteById(Id);
	}

}

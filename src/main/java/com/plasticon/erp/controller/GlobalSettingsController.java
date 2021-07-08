package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.GlobalSettings;
import com.plasticon.erp.service.GlobalSettingsService;

@RestController
@RequestMapping("/basicdetails")
public class GlobalSettingsController {
	
	@Autowired
	GlobalSettingsService globalSettingsService; 
	
	@RequestMapping(value="/getglobalsettings", method=RequestMethod.GET)
	public List<GlobalSettings> getGlobalSettings() {
		return globalSettingsService.getGlobalSettings();
	}
	
	@PostMapping(value="/saveglobalsettings", consumes="application/json")
	public void saveGlobalSettings(@RequestBody GlobalSettings globalSettings) {
		globalSettingsService.saveGlobalSettings(globalSettings);
	}
	
	@DeleteMapping(value="/removeglobalsettings/{id}")
	public void removeGlobalSettings(@PathVariable("id")int id) {
		globalSettingsService.removeGlobalSettings(id);
	}

}

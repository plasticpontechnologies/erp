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

import com.plasticon.erp.model.CertificateStudentDetailsSettings;

import com.plasticon.erp.service.CertificateStudentDetailsSettingsService;

@RestController
@RequestMapping("/MasterEntry")
public class CertificateStudentDetailsSettingsController {
	
		
			@Autowired
			CertificateStudentDetailsSettingsService certificateStudentDetailsSettingsService;

			@RequestMapping(value = "/getCertificateStudentDetailsSettings", method = RequestMethod.GET)
			public List<CertificateStudentDetailsSettings>  getCertificateStudentDetailsSettingsData() {
				return certificateStudentDetailsSettingsService.getCertificateStudentDetailsSettings();

			}
			
			  @PostMapping(value = "/saveCertificateStudentDetailsSettings", consumes = "application/json")
				public void saveCertificateStudentDetailsSettings(@RequestBody CertificateStudentDetailsSettings MasterEntry) {
					certificateStudentDetailsSettingsService.saveCertificateStudentDetailsSettings(MasterEntry);

				}
				

				  @DeleteMapping(value ="/removeCertificateStudentDetailsSettings/{id}")
				    public void removeCertificateStudentDetailsSettings(@PathVariable("id")int Id){
					  certificateStudentDetailsSettingsService.removeCertificateStudentDetailsSettings(Id);
				    }

}

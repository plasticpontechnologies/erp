package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.GenerateCertificate;
import com.plasticon.erp.service.GenerateCertificateService;

@RestController
@RequestMapping("/generate")
public class GenerateCertificateController {

	GenerateCertificateService generateCertificateService;
	
	@RequestMapping(value = "/getGenerateCertificateDetails", method = RequestMethod.GET)
	public List<GenerateCertificate> getGenerateCertificate() {
		return generateCertificateService.getGenerateCertificate();

	}

	@PostMapping(value = "/saveGenerateCertificateDetails", consumes = "application/json")
	public void saveGenerateCertificate(@RequestBody GenerateCertificate generateCertificate) {
		generateCertificateService.saveGenerateCertificate(generateCertificate);

	}

	@DeleteMapping(value = "/removeGenerateCertificate/{id}")
	public void removeGenerateCertificate(@PathVariable("id") int Id) {
		generateCertificateService.removeGenerateCertificate(Id);
	}

}

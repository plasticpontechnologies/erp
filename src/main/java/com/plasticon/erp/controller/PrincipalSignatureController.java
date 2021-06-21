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

import com.plasticon.erp.model.PrincipalSignature;
import com.plasticon.erp.service.PrincipalSignatureService;


@RestController
@RequestMapping("/MasterEntry")
public class PrincipalSignatureController {
	
		@Autowired
		PrincipalSignatureService principalSignatureService;

		@RequestMapping(value = "/getPrincipalSignature", method = RequestMethod.GET)
		public List<PrincipalSignature>  getPrincipalSignatureData() {
			return principalSignatureService.getPrincipalSignature();

		}
		
		  @PostMapping(value = "/savePrincipalSignature", consumes = "application/json")
			public void savePrincipalSignature(@RequestBody PrincipalSignature MasterEntry) {
				principalSignatureService.savePrincipalSignature(MasterEntry);

			}
			

		  @DeleteMapping(value ="/removePrincipalSignature/{id}")
		    public void removePrincipalSignature(@PathVariable("id")int Id){
			  principalSignatureService.removePrincipalSignature(Id);
		    }

}

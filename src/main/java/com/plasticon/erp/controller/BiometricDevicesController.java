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

import com.plasticon.erp.model.BiometricDevices;
import com.plasticon.erp.service.BiometricDevicesService;


@RestController
@RequestMapping("/MasterEntry")
public class BiometricDevicesController {
	
		@Autowired
		BiometricDevicesService biometricDevicesService;

		@RequestMapping(value = "/getBiometricDevices", method = RequestMethod.GET)
		public List<BiometricDevices>  getBiometricDevicesData() {
			return biometricDevicesService.getBiometricDevices();

		}
		
		  @PostMapping(value = "/saveBiometricDevices", consumes = "application/json")
			public void saveBiometricDevices(@RequestBody BiometricDevices cla) {
			  biometricDevicesService.saveBiometricDevices(cla);

			}
			

			  @DeleteMapping(value ="/removeBiometricDevices/{id}")
			    public void removeBiometricDevices(@PathVariable("id")int Id){
				  biometricDevicesService.removeBiometricDevices(Id);
			    }

}

package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.BiometricDevices;

import com.plasticon.erp.repository.BiometricDevicesRepository;


@Service
public class BiometricDevicesService {
	@Autowired
	BiometricDevicesRepository biometricDevicesRepository;
		public List<BiometricDevices> getBiometricDevices() {
			return biometricDevicesRepository.findAll();

		}
		public void saveBiometricDevices(BiometricDevices cla) {
			biometricDevicesRepository.save(cla);
			
		

		}
		@Transactional
		public void removeBiometricDevices(int id) {
			biometricDevicesRepository.deleteById(id);
		}

}

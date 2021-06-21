package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ActivePaymentGateWay;
import com.plasticon.erp.repository.ActivePaymentGateWayRepository;

@Service
public class ActivePaymentGateWayService {
@Autowired
ActivePaymentGateWayRepository activePaymentGateWayRepository;
public List<ActivePaymentGateWay> getActivePaymentGateWayDetails(){
	return activePaymentGateWayRepository.findAll();
}
public void saveActivePaymentGateWayDetails(ActivePaymentGateWay activePaymentGateWay) {
	activePaymentGateWayRepository.save(activePaymentGateWay);
}
public void deleteActivePaymentGateWayDetails(int activePaymentGateWayId) {
	activePaymentGateWayRepository.deleteById(activePaymentGateWayId);
}
}

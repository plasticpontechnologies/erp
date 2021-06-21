package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.ManagePaymentGateWay;
import com.plasticon.erp.repository.ManagePaymentGateWayRepository;

@Service
public class ManagePaymentGateWayService {
@Autowired
ManagePaymentGateWayRepository managePaymentGateWayRepository;
 public List<ManagePaymentGateWay> getManagePaymentGateWayDetails(){
		return managePaymentGateWayRepository.findAll();
	}
	public void saveManagePaymentGateWayDetails(ManagePaymentGateWay managePaymentGateWay) {
		managePaymentGateWayRepository.save(managePaymentGateWay);
	}
	public void deleteManagePaymentGateWayDetails(int managePaymentGateWayId) {
		managePaymentGateWayRepository.deleteById(managePaymentGateWayId);
	}


}

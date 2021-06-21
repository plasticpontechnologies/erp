package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.FeePayment;
import com.plasticon.erp.repository.FeePaymentRepository;

@Service
public class FeePaymentService {
	@Autowired
	private FeePaymentRepository feePaymentRepository;
	
	public List<FeePayment> getFeePayment() {
		return feePaymentRepository.findAll();

	}

	public void saveFeePayment(FeePayment feePayment) {
		feePaymentRepository.save(feePayment);
	}

	@Transactional
	public void removeFeePayment(int id) {
		feePaymentRepository.deleteById(id);
	}


}

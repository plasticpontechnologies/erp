package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.FeeListPaidByLekhpal;
import com.plasticon.erp.repository.FeeListPaidByLekhpalRepository;

@Service
public class FeeListPaidByLekhpalService {
	
	@Autowired
	private FeeListPaidByLekhpalRepository feeListPaidByLekhpalRepository;
	
	public List<FeeListPaidByLekhpal> getFeeListPaidByLekhpal() {
		return feeListPaidByLekhpalRepository.findAll();
	}

	public void saveFeeListPaidByLekhpal(FeeListPaidByLekhpal lekhpal) {
		feeListPaidByLekhpalRepository.save(lekhpal);
	}

	public void removeFeeListPaidByLekhpal(int id) {
		// TODO Auto-generated method stub
		feeListPaidByLekhpalRepository.deleteById(id);
		
	}

}

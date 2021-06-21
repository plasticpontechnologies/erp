package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SelectFeeForLekhpal;
import com.plasticon.erp.repository.SelectFeeForLekhpalRepository;

@Service
public class SelectFeeForLekhpalService {

	@Autowired
	private SelectFeeForLekhpalRepository selectFeeForLekhpalRepository;

	public List<SelectFeeForLekhpal> getSelectFeeForLekhpal() {
		return selectFeeForLekhpalRepository.findAll();
	}

	public void saveSelectFeeForLekhpal(SelectFeeForLekhpal lekhpal) {
		selectFeeForLekhpalRepository.save(lekhpal);
	}

	public void removeSelectFeeForLekhpal(int id) {
		// TODO Auto-generated method stub
		selectFeeForLekhpalRepository.deleteById(id);
		
	}
}
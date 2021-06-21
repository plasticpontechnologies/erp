package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.UpdateFee;
import com.plasticon.erp.repository.UpdateFeeRepository;

@Service
public class UpdateFeeService {
	@Autowired
	private UpdateFeeRepository updateFeeRepository;
	
	public List<UpdateFee> getUpdateFee() {
		return updateFeeRepository.findAll();

	}

	public void saveUpdateFee(UpdateFee updateFee) {
		updateFeeRepository.save(updateFee);
	}

	@Transactional
	public void removeUpdateFee(int id) {
		updateFeeRepository.deleteById(id);
	}

	
	
}

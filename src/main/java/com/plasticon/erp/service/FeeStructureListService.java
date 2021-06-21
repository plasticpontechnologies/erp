package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.FeeStructureList;
import com.plasticon.erp.repository.FeeStructureListRepository;

@Service
public class FeeStructureListService {

	@Autowired
	private FeeStructureListRepository feeStructureListRepository;
	
	public List<FeeStructureList> getFeeStructureList(){
		return feeStructureListRepository.findAll();
	}
	
	public void saveFeeStructureList(FeeStructureList fee) {
		feeStructureListRepository.save(fee);
	}
	
	public void removeFeeStructureList(int id) {
		feeStructureListRepository.deleteById(id);
	}
}

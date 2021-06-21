package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SetFeeStructure;
import com.plasticon.erp.repository.SetFeeStructureRepository;

@Service
public class SetFeeStructureService {
	
	@Autowired
	private SetFeeStructureRepository setFeeStructureRepository;
	
	public List<SetFeeStructure> getSetFeeStructure(){
		return setFeeStructureRepository.findAll();
	}
	
	public void saveSetFeeStructure(SetFeeStructure fee) {
		 setFeeStructureRepository.save(fee);
	}
	@Transactional
	public void removeSetFeeStructure(int id) {
		setFeeStructureRepository.deleteById(id);
	}
}



package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.DefineShiftDetails;

import com.plasticon.erp.repository.DefineShiftRepository;


@Service
public class DefineShiftService {
	@Autowired
	DefineShiftRepository defineShiftRepository;

	public List<DefineShiftDetails> getDefineShiftDetails() {
		return defineShiftRepository.findAll();
	}
	 

	public void saveDefineShiftDetails(DefineShiftDetails defineShift) {
		defineShiftRepository.save(defineShift);
	}

	@Transactional
	public void removeDefineShiftDetails(int id) {
		defineShiftRepository.deleteById(id);
	}

}

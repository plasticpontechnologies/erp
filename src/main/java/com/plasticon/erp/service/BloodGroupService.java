package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.BloodGroup;
import com.plasticon.erp.repository.BloodGroupRepository;

@Service
public class BloodGroupService {
	
	@Autowired
	BloodGroupRepository bloodGroupRepository;
	
	public List<BloodGroup> getBloodGroup() {
		return bloodGroupRepository.findAll();

	}

	public void saveBloodGroup(BloodGroup bloodgroup) {
		bloodGroupRepository.save(bloodgroup);
	}

	@Transactional
	public void removeBloodGroup(int id) {
		bloodGroupRepository.deleteById(id);
	}

}

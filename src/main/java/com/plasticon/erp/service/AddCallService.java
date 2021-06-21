package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.AddCall;
import com.plasticon.erp.repository.AddCallRepository;

@Service
public class AddCallService {
@Autowired
AddCallRepository addCallRepository;

public List<AddCall> getAddCallDetails(){
	return addCallRepository.findAll();
	}
public void saveAddCallDetails(AddCall addCall) {
	addCallRepository.save(addCall);
}
public void deleteAddCallDetailsById(int addCallId) {
	addCallRepository.deleteById(addCallId);
}
}

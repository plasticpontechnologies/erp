package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.AddVisitor;
import com.plasticon.erp.repository.AddVisitorRepository;

@Service
public class AddVisitorService {
@Autowired
AddVisitorRepository addVisitorRepository;

public List<AddVisitor> getAddComplaintDetails(){
	return addVisitorRepository.findAll();
	}
public void saveAddVisitorDetails(AddVisitor addVisitor) {
	addVisitorRepository.save(addVisitor);
}
public void deleteAddVisitorDetailsById(int addVisitorId) {
	addVisitorRepository.deleteById(addVisitorId);
}
}

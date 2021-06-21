package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.LeaveStructure;
import com.plasticon.erp.repository.LeaveStructureRepository;

@Service
public class LeaveStructureService {
@Autowired
LeaveStructureRepository leaveStructureRepository;

public List<LeaveStructure> getLeaveStructureDetails(){
	return leaveStructureRepository.findAll();
}
public void saveLeaveStructureDetails(LeaveStructure leaveStructure) {
	leaveStructureRepository.save(leaveStructure);
}
public void deleteLeaveStructureDetails(int leaveStructureId) {
	leaveStructureRepository.deleteById(leaveStructureId);
}
}

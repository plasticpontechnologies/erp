package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.DefineLeaveCoordinator;
import com.plasticon.erp.repository.DefineLeaveCoordinatorRepository;

@Service
public class DefineLeaveCoordinatorService {
@Autowired
DefineLeaveCoordinatorRepository defineLeaveCoordinatorRepository;
	
public List<DefineLeaveCoordinator> getDefineLeaveCoordinatorDetails(){
	return defineLeaveCoordinatorRepository.findAll();
}
public void saveDefineLeaveCoordinatorDetails(DefineLeaveCoordinator defineLeaveCoordinator) {
	defineLeaveCoordinatorRepository.save(defineLeaveCoordinator);
}
public void deleteDefineLeaveCoordinatorDetails(int deleteLeaveCoordinatorId) {
	defineLeaveCoordinatorRepository.deleteById(deleteLeaveCoordinatorId);
}
}

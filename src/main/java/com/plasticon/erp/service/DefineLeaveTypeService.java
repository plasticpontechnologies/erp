package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.DefineLeaveType;
import com.plasticon.erp.repository.DefineLeaveTypeRepository;

@Service
public class DefineLeaveTypeService {
@Autowired
DefineLeaveTypeRepository defineLeaveTypeRepository;

public List<DefineLeaveType> getDefineLeaveTyepDetails(){
	return defineLeaveTypeRepository.findAll();
}

public void saveDefineLeaveTypeDetails(DefineLeaveType defineLeaveType) {
	defineLeaveTypeRepository.save(defineLeaveType);
}
public void deleteDefineLeaveTypeById(int defineLeaveTypeId) {
	defineLeaveTypeRepository.deleteById(defineLeaveTypeId);
}
}

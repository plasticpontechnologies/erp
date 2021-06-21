package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ApproveLeave;
import com.plasticon.erp.repository.ApproveLeaveRepository;

@Service
public class ApproveLeaveService {
@Autowired
ApproveLeaveRepository approveLeaveRepository;

public List<ApproveLeave> getApproveLeave(){
	return approveLeaveRepository.findAll();
}
public void saveApproveLeave(ApproveLeave approveLeave) {
	approveLeaveRepository.save(approveLeave);
}
public void deleteApproveLeave(int approveLeaveId) {
	approveLeaveRepository.deleteById(approveLeaveId);
}
}

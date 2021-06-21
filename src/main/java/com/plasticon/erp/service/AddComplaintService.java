package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.AddComplaint;
import com.plasticon.erp.repository.AddComplaintRepository;

@Service
public class AddComplaintService {
@Autowired
AddComplaintRepository addComplaintRepository;

public List<AddComplaint> getAddComplaintDetails(){
	return addComplaintRepository.findAll();
	}
public void saveAddComplaintDetails(AddComplaint addComplaint) {
	addComplaintRepository.save(addComplaint);
}
public void deleteAddComplaintDetailsById(int addCallId) {
	addComplaintRepository.deleteById(addCallId);
}
}

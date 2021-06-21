package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ViewAdmissionRequest;
import com.plasticon.erp.repository.ViewAdmissionRequestRepository;

@Service
public class ViewAdmissionRequestService {
	@Autowired
	ViewAdmissionRequestRepository viewAdmissionRequestRepository;
		public List<ViewAdmissionRequest> getViewAdmissionRequest() {
			return viewAdmissionRequestRepository.findAll();

		}

		public void saveViewAdmissionRequest(ViewAdmissionRequest admission) {
			viewAdmissionRequestRepository.save(admission);
			

		}
		@Transactional
		public void removeViewAdmissionRequest(int id) {
			viewAdmissionRequestRepository.deleteById(id);
		}


}

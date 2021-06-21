package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ViewLocation;
import com.plasticon.erp.repository.ViewLocationRepository;


@Service
public class ViewLocationService {
	@Autowired
	ViewLocationRepository viewLocationRepository;
		public List<ViewLocation> getViewLocation() {
			return viewLocationRepository.findAll();

		}

		public void saveViewLocation(ViewLocation Transport) {
			viewLocationRepository.save(Transport);
			

		}
		@Transactional
		public void removeViewLocation(int id) {
			viewLocationRepository.deleteById(id);
		}
	

}

package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ViewAllocation;
import com.plasticon.erp.model.ViewMenu;
import com.plasticon.erp.repository.ViewAllocationRepository;
import com.plasticon.erp.repository.ViewMenuRepository;

@Service
public class ViewAllocationService {
	@Autowired
	ViewAllocationRepository viewAllocationRepository;
		public List<ViewAllocation> getViewAllocation() {
			return viewAllocationRepository.findAll();

		}

		public void saveViewAllocation(ViewAllocation timetable) {
			viewAllocationRepository.save(timetable);
			

		}
		@Transactional
		public void removeViewAllocation(int id) {
			viewAllocationRepository.deleteById(id);
		}

}

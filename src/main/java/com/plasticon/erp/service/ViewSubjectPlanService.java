package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ViewSubjectPlan;
import com.plasticon.erp.repository.ViewSubjectPlanRepository;

@Repository
public class ViewSubjectPlanService {
	@Autowired
	ViewSubjectPlanRepository viewSubjectPlanRepository;
		public List<ViewSubjectPlan> getViewSubjectPlan() {
			return viewSubjectPlanRepository.findAll();

		}

		public void saveViewSubjectPlan(ViewSubjectPlan timetable) {
			viewSubjectPlanRepository.save(timetable);
			

		}
		@Transactional
		public void removeViewSubjectPlan(int id) {
			viewSubjectPlanRepository.deleteById(id);
		}

}

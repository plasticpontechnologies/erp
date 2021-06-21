package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ViewMenu;
import com.plasticon.erp.model.ViewTimeTable;
import com.plasticon.erp.repository.ViewMenuRepository;
import com.plasticon.erp.repository.ViewTimeTableRepository;

@Service
public class ViewTimeTableService {
	@Autowired
	ViewTimeTableRepository viewTimeTableRepository;
		public List<ViewTimeTable> getViewTimeTable() {
			return viewTimeTableRepository.findAll();

		}

		public void saveViewTimeTable(ViewTimeTable timetable) {
			viewTimeTableRepository.save(timetable);
			

		}
		@Transactional
		public void removeViewTimeTable(int id) {
			viewTimeTableRepository.deleteById(id);
		}

}

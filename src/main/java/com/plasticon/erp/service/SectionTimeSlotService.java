package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SectionTimeSlot;
import com.plasticon.erp.repository.SectionTimeSlotRepository;



@Service
public class SectionTimeSlotService {
	@Autowired
	SectionTimeSlotRepository sectionTimeSlotRepository;
		public List<SectionTimeSlot> getSectionTimeSlot() {
			return sectionTimeSlotRepository.findAll();

		}

		public void saveSectionTimeSlot(SectionTimeSlot timetable) {
			sectionTimeSlotRepository.save(timetable);
		}

		@Transactional
		public void removeSectionTimeSlot(int id) {
			sectionTimeSlotRepository.deleteById(id);
		}
	

}

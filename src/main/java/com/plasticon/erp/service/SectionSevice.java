package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SectionDetails;
import com.plasticon.erp.model.SubjectDetails;
import com.plasticon.erp.model.ClassDetails;
import com.plasticon.erp.repository.SectionRepository;


@Service
public class SectionSevice {
	@Autowired
	SectionRepository sectionRepository;
		public List<SectionDetails> getSectionDetails() {
			return sectionRepository.findAll();

		}

		public void saveSectionDetails(SectionDetails staff) {
			sectionRepository.save(staff);
		}

		@Transactional
		public void removeSectionDetails(int id) {
			sectionRepository.deleteById(id);
		}
		
		public List<SectionDetails> findSectionsById(int clId) {
			return sectionRepository.findSectionsById(clId);
		}

}

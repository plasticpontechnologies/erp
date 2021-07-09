package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SubjectDetails;
import com.plasticon.erp.repository.SubjectRepository;

@Service
public class SubjectService {
	

	@Autowired
	SubjectRepository subjectRepository;
	
		public List<SubjectDetails> getSubjectDetails() {
			return subjectRepository.findAll();

		}

		public void saveSubjectDetails(SubjectDetails sub) {
			subjectRepository.save(sub);
			
				
		}
			
		@Transactional
		public void removeSubjectDetails(int id) {
			subjectRepository.deleteById(id);
		}
		
		public List<SubjectDetails> findAllActiveUsers(int clsId) {
			return subjectRepository.findAllActiveUsers(clsId);
		}

}

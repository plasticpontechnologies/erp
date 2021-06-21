package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.AssignSubjectAndTeacher;
import com.plasticon.erp.repository.AssignSubjectAndTeacherRepository;



@Service
public class AssignSubjectAndTeacherService {
	@Autowired
	AssignSubjectAndTeacherRepository assignSubjectAndTeacherRepository;
		public List<AssignSubjectAndTeacher> getAssignSubjectAndTeacher() {
			return assignSubjectAndTeacherRepository.findAll();

		}

		public void saveAssignSubjectAndTeacher(AssignSubjectAndTeacher admission) {
			assignSubjectAndTeacherRepository.save(admission);
		}

		@Transactional
		public void removeAssignSubjectAndTeacher(int id) {
			assignSubjectAndTeacherRepository.deleteById(id);
		}
	

}

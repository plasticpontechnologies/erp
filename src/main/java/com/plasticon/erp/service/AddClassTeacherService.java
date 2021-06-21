package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.AddClassTeacher;
import com.plasticon.erp.repository.AddClassTeacherRepository;


@Service
public class AddClassTeacherService {
	@Autowired
	AddClassTeacherRepository addClassTeacherRepository;
		public List<AddClassTeacher> getAddClassTeacher() {
			return addClassTeacherRepository.findAll();

		}

		public void saveAddClassTeacher(AddClassTeacher add) {
			addClassTeacherRepository.save(add);
		}

		@Transactional
		public void removeAddClassTeacher(int id) {
			addClassTeacherRepository.deleteById(id);
		}

}

package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StudentFeeRegister;
import com.plasticon.erp.repository.StudentFeeRegisterRepository;

@Service
public class StudentFeeRegisterService {
	@Autowired
	private StudentFeeRegisterRepository studentFeeRegisterRepository;
	
	public List<StudentFeeRegister> getStudentFeeRegister() {
		return studentFeeRegisterRepository.findAll();

	}

	public void saveStudentFeeRegister(StudentFeeRegister studentFeeRegister) {
		studentFeeRegisterRepository.save(studentFeeRegister);
	}

	@Transactional
	public void removeStudentFeeRegister(int id) {
		studentFeeRegisterRepository.deleteById(id);
	}

}

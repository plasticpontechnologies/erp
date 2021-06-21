package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.StudentRoute;
import com.plasticon.erp.repository.StudentRouteRepository;

@Service
public class StudentRouteService {
@Autowired
StudentRouteRepository studentRouteRepository;

public List<StudentRoute> getStudentRouteDetails(){
	return studentRouteRepository.findAll();
	}
public void saveStudentRouteDetails(StudentRoute StudentRoute) {
	studentRouteRepository.save(StudentRoute);
}
public void deleteStudentRouteDetailsById(int studentRouteId) {
	studentRouteRepository.deleteById(studentRouteId);
}
}

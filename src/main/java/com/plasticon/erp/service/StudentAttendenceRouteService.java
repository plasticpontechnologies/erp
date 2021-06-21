package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StudentAttendenceRoute;
import com.plasticon.erp.repository.StudentAttendenceRouteRepository;
@Service
public class StudentAttendenceRouteService {
@Autowired
StudentAttendenceRouteRepository studentAttendenceRepository;


public List<StudentAttendenceRoute> getStudentAttendenceDetails(){
	return studentAttendenceRepository.findAll();
}
public void saveStudentAttendenceDetails(StudentAttendenceRoute studentAttendence) {
	studentAttendenceRepository.save(studentAttendence);
}
public void deleteStudentAttendenceDetails(int attendenceId) {
	studentAttendenceRepository.deleteById(attendenceId);
}
}

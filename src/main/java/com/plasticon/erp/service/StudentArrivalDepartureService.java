package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.StudentArrivalDeparture;
import com.plasticon.erp.repository.StudentArrivalDepartureRepository;

@Service
public class StudentArrivalDepartureService {
@Autowired
StudentArrivalDepartureRepository studentArrivalDepartureRepository;

public List<StudentArrivalDeparture> getStudentArrivalDepartureDetails(){
	return studentArrivalDepartureRepository.findAll();
}
public void saveStudentArrivalDepartureDetails(StudentArrivalDeparture studentArrivalDeparture) {
	studentArrivalDepartureRepository.save(studentArrivalDeparture);
}
public void deleteStudentArrivalDepartureDetails(int studentArrivalDepartureId) {
	studentArrivalDepartureRepository.deleteById(studentArrivalDepartureId);
}
}

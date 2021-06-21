package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.plasticon.erp.model.StudentArrivalDeparture;
import com.plasticon.erp.service.StudentArrivalDepartureService;

@RestController
@RequestMapping(value="/StudentArrivalDeparture")
public class StudentArrivalDepartureController {
@Autowired
StudentArrivalDepartureService studentArrivalDepartureService;

@GetMapping(value="/getStudentArrivalDeparture")
public List<StudentArrivalDeparture> getSessionDetails(){
	return studentArrivalDepartureService.getStudentArrivalDepartureDetails();
}


@PostMapping(value="/saveStudentArrivalDeparture",consumes="application/json")
public void saveStudentArrivalDepartureDetails(@RequestBody StudentArrivalDeparture studentArrivalDeparture) {
	studentArrivalDepartureService.saveStudentArrivalDepartureDetails(studentArrivalDeparture);
}


@DeleteMapping(value="/deleteStudentArrivalDeparture/{arrivalDepartureId}")
public void deleteStudentArrivalDepartureDetails(@PathVariable int arrivalDepartureId) {
	studentArrivalDepartureService.deleteStudentArrivalDepartureDetails(arrivalDepartureId);
}
}

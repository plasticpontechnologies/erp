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
import com.plasticon.erp.model.AddRoute;
import com.plasticon.erp.model.SurveyForStudent;
import com.plasticon.erp.service.SurveyForStudentService;

@RestController
@RequestMapping("/surveyforstudent")
public class SurveyForStudentController {

	@Autowired
	SurveyForStudentService surveyforstudentService;
	
	@GetMapping(value="/getSurveyForStudentdetails")
	public List<SurveyForStudent> getSurveyForStudent(){
		return surveyforstudentService.getSurveyForStudent();
	}

	@PostMapping(value="/saveSurveyForStudentdetails",consumes="application/json")
	public void saveSurveyForStudent(@RequestBody SurveyForStudent SurveyForStudent) {
		surveyforstudentService.saveSurveyForStudent(SurveyForStudent);
	}

	@DeleteMapping(value="/deleteSurveyForStudentdetails/{forSurveyId}")
	public void deleteSurveyForStudentById(@PathVariable int forSurveyId) {
		surveyforstudentService.deleteSurveyForStudentById(forSurveyId);
		
		}
	
}

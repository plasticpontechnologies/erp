package com.plasticon.erp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.AddRoute;
import com.plasticon.erp.model.SurveyForStudent;
import com.plasticon.erp.repository.SurveyForStudentRepository;

@Service
public class SurveyForStudentService {
	
	@Autowired
	SurveyForStudentRepository surveyforstudentRepository;
	
	
	public List<SurveyForStudent> getSurveyForStudent(){
		return surveyforstudentRepository.findAll();
		}
	
	public void saveSurveyForStudent(SurveyForStudent surveyforstudent) {
		surveyforstudentRepository.save(surveyforstudent);
	}
	
	public void deleteSurveyForStudentById(int forSurveyId) {
		surveyforstudentRepository.deleteById(forSurveyId);
	}

}

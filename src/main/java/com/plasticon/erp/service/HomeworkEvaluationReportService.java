package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.HomeworkEvaluationReport;
import com.plasticon.erp.repository.HomeworkEvaluationReportRepository;



@Service
public class HomeworkEvaluationReportService {
	@Autowired
	HomeworkEvaluationReportRepository homeworkEvaluationReportRepository;
	
	public List<HomeworkEvaluationReport> getHomeworkEvaluationReport() {
		return homeworkEvaluationReportRepository.findAll();
	}
	 

	public void saveHomeworkEvaluationReport(HomeworkEvaluationReport homework) {
		homeworkEvaluationReportRepository.save(homework);
	}

	@Transactional
	public void removeHomeworkEvaluationReport(int id) {
		homeworkEvaluationReportRepository.deleteById(id);
	}
}

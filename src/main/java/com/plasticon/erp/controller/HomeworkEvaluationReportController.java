package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.HomeworkEvaluationReport;
import com.plasticon.erp.service.HomeworkEvaluationReportService;



@RestController
@RequestMapping("/homework")
public class HomeworkEvaluationReportController {
	@Autowired
	HomeworkEvaluationReportService homeworkEvaluationReportService;

	@RequestMapping(value = "/getHomeworkEvaluationReport", method = RequestMethod.GET)
	public List<HomeworkEvaluationReport>  getHomeworkEvaluationReportData() {
		return homeworkEvaluationReportService.getHomeworkEvaluationReport();

	}
	
	  @PostMapping(value = "/saveHomeworkEvaluationReport", consumes = "application/json")
		public void saveHomeworkEvaluationReport(@RequestBody HomeworkEvaluationReport homework) {
		  homeworkEvaluationReportService.saveHomeworkEvaluationReport(homework);

		}
		

	  @DeleteMapping(value ="/removeHomeworkEvaluationReport/{id}")
	    public void removeHomeworkEvaluationReport(@PathVariable("id")int Id){
		  homeworkEvaluationReportService.removeHomeworkEvaluationReport(Id);
	    }
	  

}

package com.plasticon.erp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.plasticon.erp.model.EvaluationExam;
import com.plasticon.erp.model.SelectStudentSms;
import com.plasticon.erp.model.StaffTypeSms;
import com.plasticon.erp.service.SelectStudentSmsService;


@RestController
@RequestMapping("/selectstudentsms")
public class SelectStudentSmsController {

	
	@Autowired
	SelectStudentSmsService selectstudentsmsService;
	
	@RequestMapping(value = "/getSelectStudentSms", method=RequestMethod.GET)
	public List<SelectStudentSms> getSelectStudentSms() {
		return selectstudentsmsService.getSelectStudentSms();
	}
	
	@PostMapping(value = "/saveSelectStudentSms", consumes = "application/json")
	public void saveSelectStudentSms(@RequestBody SelectStudentSms selectstudentsms) {
		selectstudentsmsService.saveSelectStudentSms(selectstudentsms);
	}
	
	@DeleteMapping(value = "/removeSelectStudentSms/{id}")
	public void removeSelectStudentSms(@PathVariable("id")int Id) {
		selectstudentsmsService.removeSelectStudentSms(Id);
	}
}
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

import com.plasticon.erp.model.AdmissionProcessMasterEntry;
import com.plasticon.erp.model.AssignSubjectAndTeacher;
import com.plasticon.erp.service.AdmissionProcessMasterEntryService;
import com.plasticon.erp.service.AssignSubjectAndTeacherService;

@RestController
@RequestMapping("/timetable")
public class AssignSubjectAndTeacherController {
	@Autowired
	AssignSubjectAndTeacherService assignSubjectAndTeacherService;

	@RequestMapping(value = "/getAssignSubjectAndTeacher", method = RequestMethod.GET)
	public List<AssignSubjectAndTeacher>  getAssignSubjectAndTeacherData() {
		return assignSubjectAndTeacherService.getAssignSubjectAndTeacher();

	}
	
	  @PostMapping(value = "/saveAssignSubjectAndTeacher", consumes = "application/json")
		public void saveAssignSubjectAndTeacher(@RequestBody AssignSubjectAndTeacher timetable) {
		  assignSubjectAndTeacherService.saveAssignSubjectAndTeacher(timetable);

		}
		

	  @DeleteMapping(value ="/removeAssignSubjectAndTeacher/{id}")
	    public void removeAssignSubjectAndTeacher(@PathVariable("id")int Id){
		  assignSubjectAndTeacherService.removeAssignSubjectAndTeacher(Id);
	    }

	

}

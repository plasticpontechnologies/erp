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

import com.plasticon.erp.model.AddClassTeacher;

import com.plasticon.erp.service.AddClassTeacherService;

@RestController
@RequestMapping("/add")
public class AddClassTeacherController {
	
		@Autowired
		AddClassTeacherService addClassTeacherService;

		@RequestMapping(value = "/getAddClassTeacher", method = RequestMethod.GET)
		public List<AddClassTeacher>  getAddClassTeacherData() {
			return addClassTeacherService.getAddClassTeacher();

		}
		
		  @PostMapping(value = "/saveAddClassTeacher", consumes = "application/json")
			public void saveAddClassTeacher(@RequestBody AddClassTeacher add) {
			  addClassTeacherService.saveAddClassTeacher(add);

			}
			

		  @DeleteMapping(value ="/removeAddClassTeacher/{id}")
		    public void removeAddClassTeacher(@PathVariable("id")int Id){
			  addClassTeacherService.removeAddClassTeacher(Id);
		    }

}

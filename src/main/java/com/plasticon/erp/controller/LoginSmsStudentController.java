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
import com.plasticon.erp.model.CanteenMasterEntry;
import com.plasticon.erp.model.LoginSmsStudent;
import com.plasticon.erp.service.LoginSmsStudentService;

@RestController
@RequestMapping("/loginsmsstudent")
public class LoginSmsStudentController {
	
	@Autowired
	LoginSmsStudentService loginsmsstudentService;
	
	
	@RequestMapping(value = "/getLoginSmsStudent", method = RequestMethod.GET)
	public List<LoginSmsStudent>  getLoginSmsStudent() {
		return loginsmsstudentService.getLoginSmsStudent();

	}
	
	  @PostMapping(value = "/saveLoginSmsStudent", consumes = "application/json")
		public void saveLoginSmsStudent(@RequestBody LoginSmsStudent loginsmsstudent) {
		  loginsmsstudentService.saveLoginSmsStudent(loginsmsstudent);

		}
		

	
}


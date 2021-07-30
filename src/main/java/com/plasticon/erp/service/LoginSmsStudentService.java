package com.plasticon.erp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.AddRoute;
import com.plasticon.erp.model.LoginSmsStudent;
import com.plasticon.erp.repository.LoginSmsStudentRepository;


@Service
public class LoginSmsStudentService {

	@Autowired
	LoginSmsStudentRepository loginsmsstudentrepository;
	
	public List<LoginSmsStudent> getLoginSmsStudent(){
		return loginsmsstudentrepository.findAll();
		}
	public void saveLoginSmsStudent(LoginSmsStudent loginsmsstudent) {
		loginsmsstudentrepository.save(loginsmsstudent);
	}
	/*
	 * public void deleteLoginSmsStudentByloginSmsId(int Id) {
	 * loginsmsstudentrepository.deleteById(Id); }
	 */
	}



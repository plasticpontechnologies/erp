package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Data
@Table(name = "student_details")
public class StudentAdmission {
	@Id
	private int studentId;
	private int AdmissionNumber;
	private String StudentName ;
	private String FatherName;
	private String MotherName;
	private Date DateOfBirth;
	private Date DateofRegistration;
	private Date FeeEffectiveFrom;
	private String Gender;
	private String Classes;
	private Long MobileNumber;
	private String Email;
	
	
}	
	
	
	



package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "student_details")
public class StudentDetails {
	@Id
	private String FullName ;
	private String ParentName;
	private String Relationship;
	private Date DateOfBirth;
	private String Gender;
	private String Standard;
	private Long MobileNumber;
	private String Address;
	private String Scholarship;
	
	

}

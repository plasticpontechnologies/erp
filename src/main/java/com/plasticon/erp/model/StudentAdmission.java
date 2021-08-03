package com.plasticon.erp.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;



@Entity
@Data
@Table(name = "student_details")
public class StudentAdmission {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	private int admissionNumber;
	private String studentName ;
	private String fatherName;
	private String motherName;
	private Date dateOfBirth;
	private Date dateofRegistration;
	private Date feeEffectiveFrom;
	private String gender;
	private String classes;
	private Long mobileNumber;
	private String email;
	

	@JsonIgnore
	@OneToMany(targetEntity = ResultSetupScholasticDetails.class)
	private List<ResultSetupScholasticDetails> rssdetails;
	
	@ManyToOne
	private ClassDetails clasde;
}	
	
	
	



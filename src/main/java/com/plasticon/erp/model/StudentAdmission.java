package com.plasticon.erp.model;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "student_details")
public class StudentAdmission {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	private int AdmissionNumber;
	private String StudentName ;
	private String FatherName;
	private String MotherName;
	private Date DateOfBirth;
	private Date DateofRegistration;
	private Date FeeEffectiveFrom;
	private String Gender;
	private Long MobileNumber;	
	private String Email;
	
	@ManyToOne
	private ClassDetails clasde;
	
	
}	
	
	
	



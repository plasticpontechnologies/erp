package com.plasticon.erp.model;
import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	
	



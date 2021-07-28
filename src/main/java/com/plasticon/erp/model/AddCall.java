package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="add_call")
public class AddCall {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addCallId;
	@OneToOne
	@JoinColumn(name="studId")
	private StudentAdmission student;
	@OneToOne() 
	@JoinColumn(name="callId")
	private CallType callType;
	private String mobileNumber;
	private String landLine;
	private String address;
	private Date followUpDate;
	private String name;
	@OneToOne()
	@JoinColumn(name="responseId")
	private Response response;
	private Date dateOfCall;
	@OneToOne()
	@JoinColumn(name="staffId")
	private StaffDetails caller;
	private int noOfChild;
	

}

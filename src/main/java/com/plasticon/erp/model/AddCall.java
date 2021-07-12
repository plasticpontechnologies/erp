package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="add_call")
public class AddCall {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addCallId;
	private String student;
	private String callType;
	private int mobileNumber;
	private int landLine;
	private String address;
	private Date followUpDate;
	private String name;
	private String response;
	private Date dateOfCall;
	private String caller;
	private int noOfChild;
	
	

}

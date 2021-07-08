package com.plasticon.erp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "student_fee_register")
public class StudentFeeRegister {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cId;
	private String classes;
	private String student;
	private Date date1;
	private Date date2;
	
	

}

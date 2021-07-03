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
@Table(name = "Home_work")
public class HomeWork {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int hwId;
	private String selectClass;
	private String selectSubject;
	private String homeWork;
	private Date dateOfHomeWork;
	private Date dateOfSubmission;
	

}

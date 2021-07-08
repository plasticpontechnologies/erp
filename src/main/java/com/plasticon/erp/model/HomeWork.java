package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.Data;

@Entity
@Data
@Table(name = "Home_work")
public class HomeWork {

	@Id
	@TableGenerator(name = "homework", table = "homewspktb", pkColumnName = "homewkey", pkColumnValue = "homewvalue",
	allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "homework") 
	private int hwId;
	private String selectClass;
	private String selectSubject;
	private String homeWork;
	private Date dateOfHomeWork;
	private Date dateOfSubmission;
	

}

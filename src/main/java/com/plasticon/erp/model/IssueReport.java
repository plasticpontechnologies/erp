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
@Table(name="issue_report")
public class IssueReport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int uId;
	private String className;
	private String student;
	private String selectBook;
	private String type;
	private Date fromDate;
	private Date toDate;
	
	
}

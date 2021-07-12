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
@Table(name="issue_return")
public class IssueReturn {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rId;
	private String bookIssue;
	private String books;
	private String selectStudent;
	private Date dateOfIssue;
	private Date dateOfReturn;
	private String remarks;
	
}
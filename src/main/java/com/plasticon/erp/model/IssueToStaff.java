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
@Table(name="issue_staff")
public class IssueToStaff {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int issueId;
	private String bookIssue;
	private String books;
	private String selectStaff;
	private Date dateOfIssue;
	private Date dateOfReturn;
	private String remarks;
	
}

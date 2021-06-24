package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="issuereport_staff")
public class IssueReportStaff {
	
	@Id
	private int reportStaffId;
	private String userType;
	private String staffPosition;
	private String selectBook;
	private String selectStaff;
	private Date fromDate;
	private Date toDate;
	private String type;
	
}

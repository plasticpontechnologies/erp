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
@Table(name="approve_leave")
public class ApproveLeave {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int approveLeaveId;
	private String name;
	private String leaveType;
	private Date fromDate;
	private Date toDate;
	private int day;
	private String status;
	
}

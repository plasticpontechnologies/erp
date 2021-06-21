package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "display_student_slot")
public class StudentSlotAttendanceReport {
	@Id
	private int ssarId;
	private String studentName;
	private Date fromDate;
	private Date toDate;

}

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
@Table(name = "display_student_slot")
public class StudentSlotAttendanceReport {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ssarId;
	private String studentName;
	private Date fromDate;
	private Date toDate;

}

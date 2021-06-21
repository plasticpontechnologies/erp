package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "student_attendance_summary")
public class StudentAttendanceSummary {
	@Id
	private int sasId;
	private Date fromDate;
	private Date toDate;
	private String className;
	private String studentName;
	private int percentage;
	private int admissionNumber;
	

}

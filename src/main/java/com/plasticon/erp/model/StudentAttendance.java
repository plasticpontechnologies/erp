package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "student_attendance")

public class StudentAttendance {
	@Id
	private int studentId;
	private String className;
	private int admissionNumber;
	private Date dateAttendanceOn;
	private String status;

}

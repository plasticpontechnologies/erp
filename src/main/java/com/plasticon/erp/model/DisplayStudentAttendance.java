package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "display_student_attendance")
public class DisplayStudentAttendance {
	@Id
	private int dsaId;
	private String monthYear;
	private String className;
	private int admissionNumber;
	

}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "school_wise_attendance_report")
public class StudentAttendanceReport {
	@Id
	private int sarId;
	private String monthYear;
	private String className;

}

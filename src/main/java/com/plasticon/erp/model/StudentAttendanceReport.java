package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "school_wise_attendance_report")
public class StudentAttendanceReport {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sarId;
	private String monthYear;
	private String className;

}

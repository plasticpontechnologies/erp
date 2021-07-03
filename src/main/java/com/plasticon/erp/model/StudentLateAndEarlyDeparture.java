package com.plasticon.erp.model;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "student_late_early")
public class StudentLateAndEarlyDeparture {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sleId;
	private String description;
	private String studentName;
	private Time time;
	private String type;

}

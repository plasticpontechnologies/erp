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
@Table(name = "my_schedule")
public class MySchedule {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int msId;
	private String selectStaff;
	private Date selectDate;
	private String selectClass;
	private String slot;
	private String subject;

}

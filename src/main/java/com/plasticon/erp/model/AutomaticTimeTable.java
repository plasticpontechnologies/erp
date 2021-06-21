package com.plasticon.erp.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "automatic_timetable")
public class AutomaticTimeTable {
	@Id
	private int attId;
	private Date fromDate;
	private Date toDate;
	private Time startTime;
	private Time endTime;
	private int noOfSlots;
	private String holidayNotification;

}

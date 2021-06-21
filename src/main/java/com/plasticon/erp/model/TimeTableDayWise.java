package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "timetable_daywise")
public class TimeTableDayWise {
	@Id
	private int timeId;
	private String className;
	private String day;
	private Date fromDate;
	private Date toDate;
	private String asHoliday;

}

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
@Table(name = "timetable_datewise")
public class TimeTableDateWise {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int timeId;
	private String className;
	private Date selectdate;
	private String asHoliday;

}

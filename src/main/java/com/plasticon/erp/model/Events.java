package com.plasticon.erp.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Data
@Table(name = "Events")

public class Events {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eId;
	private String title;
	private String color;
	private Date startDate;
	private Time startTime;
    private Date endDate;
	private Time endTime;

	
}

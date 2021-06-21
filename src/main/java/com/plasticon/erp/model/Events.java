package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Events")

public class Events {

	@Id
	private int eId;
	private String title;
	private String color;
	private String startDate;
	private String startTime;
    private String endDate;
	private String endTime;

	
}

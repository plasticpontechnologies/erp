package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.Data;

@Entity
@Data
@Table(name = "Events")

public class Events {

	@Id
	@TableGenerator(name = "entity", table = "eventspktb", pkColumnName = "ekey", pkColumnValue = "evalue",
	allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "entity") 
	private int eId;
	private String title;
	private String color;
	private String startDate;
	private String startTime;
    private String endDate;
	private String endTime;

	
}

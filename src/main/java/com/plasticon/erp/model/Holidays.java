package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.aspectj.lang.annotation.DeclareAnnotation;

import lombok.Data;

@Entity
@Data
@Table(name = "Holidays")
public class Holidays {
	@Id
	private int hId;
	private String day;
	
	private String title;
	private String startDate;
	private String endDate;

}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Data
@Table(name = "Holidays")
public class Holidays {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int hId;
	private String day;
	
	private String title;
	private String startDate;
	private String endDate;

}

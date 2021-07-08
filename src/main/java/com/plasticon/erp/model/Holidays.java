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
@Table(name = "Holidays")
public class Holidays {
	@Id
	@TableGenerator(name = "holi", table = "holispktb", pkColumnName = "holikey", pkColumnValue = "holivalue",
	allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "holi") 
	private int hId;
	private String day;
	
	private String title;
	private String startDate;
	private String endDate;

}

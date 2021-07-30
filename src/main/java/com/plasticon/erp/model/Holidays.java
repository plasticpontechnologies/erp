package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


import lombok.Data;

@Entity
@Data
@Table(name = "Holidays")
public class Holidays {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int hId;
	@OneToOne()
	@JoinColumn(name="dayhID")
	private DayDetails day;
	private String title;
	private Date startDate;
	private Date eneddd;
	
	

}

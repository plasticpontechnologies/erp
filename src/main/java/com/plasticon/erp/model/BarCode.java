package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="bar_code")
public class BarCode {

	@Id
	private int bId;
	private String selectBook;
	private int accessionNo;
	private Date fromDate;
	private Date toDate;
	
}

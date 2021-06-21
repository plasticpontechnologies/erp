package com.plasticon.erp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "fee_lekhpal")
public class SelectFeeForLekhpal {

	@Id
	private int sid;
	private String session;
	private Date uptoMonth;
	private double paidAmount;
	private Date dueDate;
	
}

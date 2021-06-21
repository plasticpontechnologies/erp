package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "class_fees")
public class ClassFees {
	
	@Id
	private int cId;
	private String classes;
	private String feeType;
	private String frequency;
	private String status;
	private double amount;

}

package com.plasticon.erp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "set_fee")
public class SetFeeStructure {
	@Id
	private int setFeeId;
	private Date fromMonth;
	private String admissionNumber;
	private double monthwise;
	private double yearly;
	private double everyMonth;
	private double transport;
	private String remarks;
	
	
}

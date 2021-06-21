package com.plasticon.erp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "fee_paid_l")
public class FeeListPaidByLekhpal {

	@Id
	private int receiptNo;
	private double amount;
	private Date sDate;
	private Date paymentType;
	private String remarks;

}

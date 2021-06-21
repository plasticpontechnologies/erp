package com.plasticon.erp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "online_transaction_report")
public class OnlineTransactionReport {
	
	@Id
	private int otrId;
	private int transactionId;
	private long feeReceipt;
	private long mobile;
	private Date trDate;
	private double amount;
	private String status;
	private String name;
	private String email;

}

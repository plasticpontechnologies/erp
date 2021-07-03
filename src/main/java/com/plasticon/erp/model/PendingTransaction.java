package com.plasticon.erp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "pending_transaction")
public class PendingTransaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ptId;
	private String bankStatus;
	private String approvedStatus;
	private long amount;
	private long transactionId;
	private long bankRefNo;
	private String name;
	private String email;
	private Date tdate;
	private long mobile;
	
	

}

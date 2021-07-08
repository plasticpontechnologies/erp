package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="revert_transactions")
public class RevertTransaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int revertTransactionId;
	private Date fromDate;
	private Date toDate;
	private String selectType;
	private int incomeId;
	private int expenseId;
	private int accountTransferId;

}

package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="record_income")
public class RecordIncome {
	@Id
	private int recordIncomeId;
	private int manualRecieptNumber;
	private String incomeHead;
	private int amount;
	private String account;
	private Date dateOfIncome;
	private String student;
	private String remarks;

}

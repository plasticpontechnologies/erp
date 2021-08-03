package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="record_income")
public class RecordIncome {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int recordIncomeId;
	private int manualRecieptNumber;
	@OneToOne()
	@JoinColumn(name="incId")
	private IncomeHead incomeHead;
	private double amount;
	@OneToOne()
	@JoinColumn(name="accId")
	private CreateAccount account;
	private Date dateOfIncome;
	@OneToOne()
	@JoinColumn(name="stdId")
	private StudentAdmission student;
	private String remarks;
	

}

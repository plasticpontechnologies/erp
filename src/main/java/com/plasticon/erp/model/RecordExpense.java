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
@Table(name="record_expense")
public class RecordExpense {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int recordExpenseId;
@OneToOne()
@JoinColumn(name="expId")
private ExpenseHead expenseHead;
private double amount;
private Date expenseDate;
@OneToOne()
@JoinColumn(name="stdId")
private StudentAdmission student;
private String expenseRemark;
private String amountpaid;
private int manualReceipt;
private double payment;
@OneToOne()
@JoinColumn(name="accId")
private CreateAccount account;
private Date dateOfPayment;
private String remarks;

}

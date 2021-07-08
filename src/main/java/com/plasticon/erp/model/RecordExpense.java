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
@Table(name="record_expense")
public class RecordExpense {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int recordExpenseId;
private String expenseHead;
private int amount;
private Date expenseDate;
private String student;
private String expenseRemark;
private String amountpaid;
private int manualReceipt;
private int payment;
private String account;
private Date dateOfPayment;
private String remarks;

}

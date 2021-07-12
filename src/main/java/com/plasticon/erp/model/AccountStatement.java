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
@Table(name="account_statement")
public class AccountStatement {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int accountStatementId;
private String selectAccount;
private String orderBy;
private Date fromDate;
private Date toDate;
}

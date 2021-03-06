package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="account_balance_transfer")
public class AccountBalanceTransfer {
@Id
private int accountbalanceTransferId;
private String fromAccount;
private String toAccount;
private Long amount;
private Date selectDate;
private String remarks;

}

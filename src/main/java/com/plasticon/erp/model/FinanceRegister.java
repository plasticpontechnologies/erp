package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="finance_register")
public class FinanceRegister {
@Id
private int financeRegisterId;
private Date fromDate;
private Date toDate;
private String selectType;
private String selectAccount;

}
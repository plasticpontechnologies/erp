package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="create_account")
public class CreateAccount {
@Id
private int accountId;
private String accountType;
private String accountName;
private Integer balance;
private Date accountStartDate;
private String status;


}

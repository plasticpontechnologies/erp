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
@Table(name="create_account")
public class CreateAccount {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int accountId;
@OneToOne()

@JoinColumn(name="acctypeId")
private CreateAccountType accountType;
private String accountName;
private Integer balance;
private Date accountStartDate;
private String status;


}

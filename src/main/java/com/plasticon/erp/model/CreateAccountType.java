package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="create_account_type")
public class CreateAccountType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String accountType;
	private String status;

	
}

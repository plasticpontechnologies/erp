package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="create_account_type")
public class CreateAccountType {
	@Id
	private int id;
	private String accountType;
	private String status;

	
}

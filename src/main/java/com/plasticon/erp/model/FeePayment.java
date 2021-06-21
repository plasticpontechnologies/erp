package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "fee_payment")
public class FeePayment {
	
	@Id
	private int pId;
	private String student;
	private String uptoMonth;

}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "define_fee")
public class DefineFeeType {
	@Id
	private int fId;
	private String feeType;
	private String frequency;

	

}

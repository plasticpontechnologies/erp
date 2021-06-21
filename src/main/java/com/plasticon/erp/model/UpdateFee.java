package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "update_fee")
public class UpdateFee {
	
	@Id
	private int ufId;
	private String classes;
	private String student;
	

}

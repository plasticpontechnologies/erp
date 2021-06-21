package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="division_details")
public class Division {
	
	@Id
	private int dId;
	private String division;
	
}

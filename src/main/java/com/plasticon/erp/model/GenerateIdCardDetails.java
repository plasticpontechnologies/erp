package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "generateIdcard")
public class GenerateIdCardDetails {
    
	@Id
	private int generateId;
	private String staffName;
	private String headerColor;
	private String bodyColor;
	private String footerColor;
	private String labelColor;
	private String printIdCardPage;
	
}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "generateIdcard")
public class GenerateIdCardDetails {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int generateId;
	private String staffName;
	private String headerColor;
	private String bodyColor;
	private String footerColor;
	private String labelColor;
	private String printIdCardPage;
	
}

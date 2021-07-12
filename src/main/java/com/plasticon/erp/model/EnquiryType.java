package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "enquiry_type")
public class EnquiryType {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int etId;
	private String enquiryType;

}
package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "enquiry_type")
public class EnquiryType {
	@Id 
	private int etId;
	private String enquiryType;

}

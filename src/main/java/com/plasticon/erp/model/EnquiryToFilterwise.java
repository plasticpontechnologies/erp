package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="filterwise_details")
public class EnquiryToFilterwise {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int filterId;
	private Date dateOfEnquiry;
	private String enquiryType;
	private String reference;
	private String response;
	private String filterClass;
	
}

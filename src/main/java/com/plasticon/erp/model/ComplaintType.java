package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "complaint_type")
public class ComplaintType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ctId;
	private String complaintType;

}

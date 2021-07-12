package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "admission_process_master")
public class AdmissionProcessMasterEntry {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int apId;
	private String referenceTypeName;
	private String Status;

}

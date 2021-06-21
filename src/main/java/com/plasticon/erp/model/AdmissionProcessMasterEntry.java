package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "admission_process_master")
public class AdmissionProcessMasterEntry {
	@Id
	private int apId;
	private String referenceTypeName;
	private String Status;

}

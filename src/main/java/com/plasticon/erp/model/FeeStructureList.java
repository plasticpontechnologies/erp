package com.plasticon.erp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "fee_structure")
public class FeeStructureList {
	
	@Id
	private int feeStructureId;
	private Date from;
	private String feeStructure;
	private String action;

}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "fees_due_school")
public class FeesDueSchool {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int fdId;
	private String fromMonth;
	private String uptoMonth;
	private String feeType;
	

}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "termination_reason")
public class TerminationReason {
	
	@Id
	private int tId;
	private String reason;

}

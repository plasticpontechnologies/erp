package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "purpose")
public class Purpose {
	@Id
	private int purposeId;
	private String purpose;

}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "fees_due")
public class FeesDue {
	@Id
	private int cId;
	private String Student;
	private String uptoMonth;

}

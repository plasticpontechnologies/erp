package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "view_allocation")
public class ViewAllocation {
	@Id
	private int vaId;
	private String type;
	private String subject;

}

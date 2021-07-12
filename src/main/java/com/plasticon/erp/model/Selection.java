package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="selection_Details")
public class Selection {
	
	@Id
	private int sdId;
	private String sdAll;
	private String classWise;
	
	
	
}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="selectiontype_details")
@Data
public class SelectionDetails {

	@Id
	private int seId;
	private String seAll;
	private String ClassWise;
	
}

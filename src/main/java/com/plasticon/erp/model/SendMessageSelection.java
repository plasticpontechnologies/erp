package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="selection_Details")
public class SendMessageSelection {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sdId;
	private String selection;
	
	
	
	
}

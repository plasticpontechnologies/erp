package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "stu_document")
public class Document {
	
	@Id
	private int dId;
	private String document;
	

}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "document_list")

public class DocumentList {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dId;
	private String classes;
	private String student;

	private String documentType;

	

}

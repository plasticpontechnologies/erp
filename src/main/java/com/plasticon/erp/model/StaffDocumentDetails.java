package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="staff_documents")
public class StaffDocumentDetails {
	
	@Id
	private int docId;
	private String staffDocument;
	

}

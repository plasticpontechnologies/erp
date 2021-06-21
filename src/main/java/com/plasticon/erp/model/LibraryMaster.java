package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="library_master")
public class LibraryMaster {
	
	@Id
	private int maId;
	private  String bookPurpose;
	private String status;
	
	
}

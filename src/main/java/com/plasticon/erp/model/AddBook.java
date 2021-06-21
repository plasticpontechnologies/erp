package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="add_book")
public class AddBook {
	
	@Id
	private int bId;
	private String subject;
	private String purpose;
	private String bookName;
	private String authorName;
	private String publisher;
	private int price;
	
}

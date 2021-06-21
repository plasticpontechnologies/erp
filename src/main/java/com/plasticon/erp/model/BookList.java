package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="book_list")
public class BookList {
	
	@Id
	private int  lId;
	private String selectBook;
	private String quantity;
	
}

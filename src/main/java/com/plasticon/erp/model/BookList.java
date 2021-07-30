package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="book_list")
public class BookList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int  lId;
	private String quantity;
	
	 @OneToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name="fk_lId")
	 private AddBook addbook;
	
}

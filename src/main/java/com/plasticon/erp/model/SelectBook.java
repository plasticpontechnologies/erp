package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="select_book")
public class SelectBook {
	@Id
	private int sId;
	private String books;
	private int accessionNo;
	

}

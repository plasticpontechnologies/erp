package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="newbook_details")
public class NewBook {
	
	@Id
	private int nId;
	private Date ndate;
	private String remarks;
	
}
	
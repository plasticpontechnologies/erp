package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="notice_board")
public class NoticeBoard {
	
	@Id
	private int nId;
	private String typeOfNotice;
	private String sendNoticeTo;
	private String description;
	private String pdf;
	private String  status;
	private Date  expiryDate;
	
}

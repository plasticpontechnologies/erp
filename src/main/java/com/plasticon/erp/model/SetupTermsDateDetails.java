package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "setupterms_Date_details")
public class SetupTermsDateDetails {
	
	@Id
	private int setupTermsDateId;
	private String TermName;
	private Date startDate;
	private Date endDate;
	private String otherLogo;
	private String backgroundImage;

}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "clauses_details")
public class ClausesDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cdId;
	private String certificateType;
	private String textFile;

}

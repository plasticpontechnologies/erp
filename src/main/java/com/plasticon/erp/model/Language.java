package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "language_details")
public class Language {
	@Id
	private int languageId;
	private String languageName;
	

}

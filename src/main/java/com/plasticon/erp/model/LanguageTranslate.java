package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "language_translate")
public class LanguageTranslate {
	@Id
	private int ltId;
	private String translateEnglishTo;
	private String frontOffice;
	private String followUp;
	private String otherCall;
	private String enquiry;
	private String complaint;
	private String visitorBook;
	private int admission;
	private String registration;

}

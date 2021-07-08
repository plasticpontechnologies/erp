package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name= "Sections")
public class SectionDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sectionId;
	private String sectionName;
	@ManyToOne(fetch = FetchType.EAGER)
	private classes cl;

}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "fees_due_family")
public class FeesDueForEntireFamily {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int fdfId;
	private String family;
	private String uptoMonth;
}

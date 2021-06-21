package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "generate_certificate")

public class GenerateCertificate {
	@Id
	private int gcId;
	private String selectSession;
	private String student;
	private String classes;
	private String certificate;

}

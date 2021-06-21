package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "generate_identity")

public class GenerateIdentityCard {

	@Id
	private int gId;
	private String classes;
	private String student;

}

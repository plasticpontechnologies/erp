package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "generate_identity")

public class GenerateIdentityCard {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int gId;
	private String classes;
	private String student;

}

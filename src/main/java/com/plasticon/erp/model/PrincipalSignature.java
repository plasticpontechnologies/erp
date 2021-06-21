package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "principal_signature")
public class PrincipalSignature {
	@Id
	private int psId;
	private String principalSignature;

}

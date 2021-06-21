package com.plasticon.erp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "transfer_class")
public class TransferClass {

	@Id
	private int tcId;
	private Date dateOfEffectiveFrom;
	private String currentClass;
	private String student;
	private String toClass;

}

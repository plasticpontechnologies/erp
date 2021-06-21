package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "get_class_fee")
public class GetClassFeeStructure {

	@Id
	private int gcfId;
	private String classes;
}

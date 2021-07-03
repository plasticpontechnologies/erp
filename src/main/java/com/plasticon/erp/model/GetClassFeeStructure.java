package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "get_class_fee")
public class GetClassFeeStructure {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int gcfId;
	private String classes;
}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="income_head")
public class IncomeHead {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int incomeHeadId;
	private String incomeHead;
	


}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "menutypes")
public class MenuTypeDetails {
	@Id
	private int mtId;
	private String menutypeName;

}

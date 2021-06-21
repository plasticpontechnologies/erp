package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "view_location")
public class ViewLocation {
	@Id
	private int vlId;
	private String routeTo;
	private String route;
	private String type;

}

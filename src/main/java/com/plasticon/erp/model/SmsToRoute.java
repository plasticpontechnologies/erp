package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="smsroute_details")
public class SmsToRoute {

	@Id
	private int routeId;
	private String routeClass;
	
}

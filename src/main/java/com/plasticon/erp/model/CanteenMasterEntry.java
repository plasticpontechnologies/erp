package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "canteen_details")
public class CanteenMasterEntry {
	@Id
	private int canteenId;
	private String canteenMealType;
	private String canteenStatus;
	

}

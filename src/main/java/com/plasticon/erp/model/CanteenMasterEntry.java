package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "canteen_details")
public class CanteenMasterEntry {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int canteenId;
	private String canteenMealType;
	private String canteenStatus;
	

}

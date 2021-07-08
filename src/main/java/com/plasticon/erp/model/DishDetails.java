package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "dish_details")
public class DishDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dishId;
	private String dishName;
	private int dishPrice;
	

}

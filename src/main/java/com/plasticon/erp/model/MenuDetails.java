package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "menu_details")
public class MenuDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int menuId;
	private String menuName;
	private String dishes;

}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "menu_details")
public class MenuDetails {
	@Id
	private int menuId;
	private String menuName;
	private String dishes;

}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name= "view_menu")
public class ViewMenu {
	@Id
	private int vmId;
	private String day;
	private String mealType;

}

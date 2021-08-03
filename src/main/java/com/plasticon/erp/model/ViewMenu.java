package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name= "view_menu")
public class ViewMenu {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vmId;
	@OneToOne()
	@JoinColumn(name="dayId")
	private DayDetails day;
	@OneToOne()
	@JoinColumn(name="mealId")
	private CanteenMasterEntry mealType;

}

package com.plasticon.erp.model;

import javax.persistence.CascadeType;
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
@Table(name = "mess_schedule")
public class MessSchedule {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int msId;
	@OneToOne()
	@JoinColumn(name="dayId")
	private DayDetails day;
	@OneToOne()
	@JoinColumn(name="menuId")
	private MenuDetails menu;
	@OneToOne()
	@JoinColumn(name="canteenId")
	private CanteenMasterEntry mealtype;
	@OneToOne()
	@JoinColumn(name="dishId")
	private DishDetails dishes;

}

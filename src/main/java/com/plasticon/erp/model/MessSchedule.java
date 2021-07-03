package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "mess_schedule")
public class MessSchedule {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int msId;
	private String day;
	private String menu;
	private String mealtype;
	private String Dishes;

}

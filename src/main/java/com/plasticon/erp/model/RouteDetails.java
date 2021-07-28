package com.plasticon.erp.model;

import java.sql.Time;

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
@Table(name="route_details")
public class RouteDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int routeId;
	@OneToOne
	@JoinColumn(name="routeId")
	private AddRoute route;
	@OneToOne
	@JoinColumn(name="stopId")
	private CreateStoppage stoppage;
	private Time sTime;
	private String Type;
	
}

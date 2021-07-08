package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="city")
public class City {
	
	@Id
	private int cityId;
	private String cityName;
	private int stateId;
	

}

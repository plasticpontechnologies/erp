package com.plasticon.erp.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="States")
public class State {
	
	@Id
	private int stateId;
	private String stateName;
	private int countryId;

}
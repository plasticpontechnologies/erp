package com.plasticon.erp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	
	@JoinColumn(name = "stateId", referencedColumnName = "stateId")
	private List<City> city;

}

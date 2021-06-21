package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="country")
public class Country {
	
	@Id
	private int countryId;
	private String ctryName;

}

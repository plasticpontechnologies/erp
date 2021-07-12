package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="countrycode")
public class CountryCode {
	
	@Id
	private int countryId;
	private int countryCode;

}

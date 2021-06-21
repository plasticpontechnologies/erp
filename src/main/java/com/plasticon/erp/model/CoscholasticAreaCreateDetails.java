package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="CSAC")
public class CoscholasticAreaCreateDetails {
	
	@Id
	private int coscholasticAreaCreateId;
	private String coscholasticAreaName;
	

}

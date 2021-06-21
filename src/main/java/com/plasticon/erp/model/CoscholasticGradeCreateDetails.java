package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="CSGC")
public class CoscholasticGradeCreateDetails {
	
	@Id
	private int coscholasticGradeCreateId;
	private String coscholasticGradeName;

}

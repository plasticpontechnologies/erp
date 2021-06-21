package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="SGC")
public class ScholasticGradeCreateDetails {
	
	@Id
	private int gradeId;
	private String gradeName;
	

}

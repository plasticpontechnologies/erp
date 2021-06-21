package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "stu_category")
public class Category {
	
	@Id
	private int cId;
	private String Categories;
	
	

}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="add_exam_permission")
public class AddExamEntryPermission {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int slno;
	private String scholastic;
	private String coScholastic;

}

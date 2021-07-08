package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="add_exam_permission")
public class AddExamEntryPermission {
	
	@Id
	private int slno;
	private String scholastic;
	private String coScholastic;

}

package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "add_class_teacher")
public class AddClassTeacher {
	@Id
	private int actId;
	private String selectClass;
	private String staff;

}

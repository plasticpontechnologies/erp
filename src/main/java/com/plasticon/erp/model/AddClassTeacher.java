package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "add_class_teacher")
public class AddClassTeacher {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int actId;
	private String selectClass;
	private String staff;

}

package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "view_time_table")
public class ViewTimeTable {
	@Id
	private int vttId;
	private String className;
	private Date selectDate;

}

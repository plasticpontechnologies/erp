package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "stu_occupation")

public class Occupation {
	@Id
	private int oId;
	private String occupation;


}

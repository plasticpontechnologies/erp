package com.plasticon.erp.model;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name="elective_subject")
public class ElectiveSubject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eId;
	private String selectClass;
	private String student;
	
	@JsonIgnore
	@OneToOne(targetEntity = ClassDetails.class)
	private List<ClassDetails> clas;
	
	
}

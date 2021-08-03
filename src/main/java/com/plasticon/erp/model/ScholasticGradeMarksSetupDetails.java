package com.plasticon.erp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.Data;

@Entity
@Data
@Table(name ="SGMS_Details")
public class ScholasticGradeMarksSetupDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sgmsId;
	private int maximumMarks;
//	private String grade;
	private int maximum;
	private int minimum;
	private String result;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "g_fk")
	private ScholasticGradeCreateDetails sdcd;

}

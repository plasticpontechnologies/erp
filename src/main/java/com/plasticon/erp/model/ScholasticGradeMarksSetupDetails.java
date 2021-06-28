package com.plasticon.erp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.Data;

@Entity
@Data
@Table(name ="SGMS_Details")
public class ScholasticGradeMarksSetupDetails {
	
	@Id
	private int sgmsId;
	private int maximumMarks;
	private String grade;
	private int maximum;
	private int minimum;
	private String result;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "gid_fk", referencedColumnName = "sgmsId")
	private List<ScholasticGradeCreateDetails> details = new ArrayList<>();

}

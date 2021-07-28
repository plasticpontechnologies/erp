package com.plasticon.erp.model;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


@Entity
@Data
@Table(name="surveyfor_student")
public class SurveyForStudent {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int forSurveyId;
	private String studentClass;
	private String SurveyName;
	
	//@JsonIgnore
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="fk_forSurveyId")
	private ClassDetails classdetails;
	}
	
	


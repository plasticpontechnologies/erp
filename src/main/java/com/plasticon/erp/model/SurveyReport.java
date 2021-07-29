package com.plasticon.erp.model;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import antlr.collections.List;
import lombok.Data;


@Entity
@Data
@Table(name="survey_report")
public class SurveyReport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int suId;
	private String surveyNam;
	
	
	 @OneToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name="fk_Id")
	 private SurveyInformation surveyinformation;
	
}

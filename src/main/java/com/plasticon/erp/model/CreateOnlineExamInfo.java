package com.plasticon.erp.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "exam_information_settings")
public class CreateOnlineExamInfo {
	
	@Id
	private int slno;
	private String examName;
	private String examtype;
	private int selectmax_Marks;
	private int examDuration;
	private Date examOpenDate;
	private Time examOpenTime;
	private Date examCloseDate;
	private Time examCloseTime;
	private String ResultPublish;
	private String showResultAfterexam;
	private String showHint;
	private String showsolutionDetail;
	private String browsingAllow;
	private String typeOfQuestion;
	private String difficultyLevel;
	private String subject;
	private String className;
	private String topic;
	private String bookName;
	
   
	

}

package com.plasticon.erp.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "exam_information_settings")
public class CreateOnlineExamInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int slno;
	private String examName;
	//private String examtype;
	//private int selectmax_Marks;
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
	//private String difficultyLevel;
	//private String subject;
	//private String className;
	private String topic;
	private String bookName;
	
   @OneToOne(fetch = FetchType.EAGER)
   @JoinColumn(name="td_fk")
   private ExamTypeDetails typedetails;
   
   @OneToOne(fetch = FetchType.EAGER)
   @JoinColumn(name="mm_fk")
   private ScholasticGradeMarksSetupDetails maxmarks;
   
   @OneToOne(fetch = FetchType.EAGER)
   @JoinColumn(name="dl_fk")
   private OnlineExamDifficultyLevel difficultylevel;
   
   @OneToOne(fetch = FetchType.EAGER)
   @JoinColumn(name="ab_fk")
   private AddBook addbook;
   
   @OneToOne(fetch = FetchType.EAGER)
   @JoinColumn(name="et_fk")
   private OnlineExamTopic topic1;
	
   @ManyToOne
   private SubjectDetails subj;
   
}

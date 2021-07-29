package com.plasticon.erp.model;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="selectstudentsms")
public class SelectStudentSms {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentTypeId;
	private String selectStudent;
	private String sendMessageUsing;
	private int menumber;
	private String language;
	private String messageContent;
	
	@OneToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name="fk_studentTypeId")
	 private StudentAdmission studentadmission;
	
}
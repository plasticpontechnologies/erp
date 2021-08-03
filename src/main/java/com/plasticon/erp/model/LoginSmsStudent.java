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
@Table(name="loginsmsstudent")
public class LoginSmsStudent {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int loginSmsId;
	private String selectStudent;
	private String shareLoginLink;
	private String sendMessageUsing;
	private int mnumber;
	private String language;
	private String fixedContent;
	private String messageContent;
	
	
	@OneToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name="fk_loginSmsId")
	 private StudentAdmission studentadmission;
	
}


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
@Table(name = "online_exam")
public class AssignExam {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int slno;
	//private String Onlineexam;
	//Sprivate String classes;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "oe_fk")
	private CreateOnlineExamInfo onlineexam;
	
	
	
	

}

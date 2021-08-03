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
@Table(name = "examSchedules_details")
public class ExamSchedulesDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int examscheduleId;
//	private String className;
//	private String examType;
    private String scheduleExam;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cd_fk")
    private ClassDetails cd;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "etd_fk")
    private ExamTypeDetails etd;
}

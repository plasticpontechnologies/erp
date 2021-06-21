package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "examSchedules_details")
public class ExamSchedulesDetails {
	
	@Id
	private int examscheduleId;
	private String className;
	private String examType;
    private String scheduleExam;
    
}

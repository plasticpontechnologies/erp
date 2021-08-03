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
@Table(name="classwise_details")
public class SendSmsToClassWise {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int clsclId;
	private String smsclass;
	
	
	 @OneToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name="fk_clId")
	 private ClassDetails classdetails;
	
}

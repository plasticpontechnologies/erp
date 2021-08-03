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
@Table(name="smsstaff_details")
public class SendSmsToStaff {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int staffSmsId;
	private String selectStaff;
	private String sendMessageUsing;
	private int selectNumber;
	private String language;
	private String messageContent;
	
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="fk_staffId")
	 private StaffDetails staffdetails;
}

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
@Table(name="sendmessageall")
public class SendMessageAll {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int allId;
	private String selectAll;
	private String sendMessageUsing;
	private int selectNumber;
	private String language;
	private String messageContent;
	
	
	
}

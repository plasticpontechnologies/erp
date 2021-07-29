package com.plasticon.erp.model;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import lombok.Data;


@Entity
@Data
@Table(name="smsroute_details")
public class SmsToRoute {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int routeId;
	private String routeClass;
	
	 @OneToOne(fetch = FetchType.EAGER)
	 @NotFound(action = NotFoundAction.IGNORE)
	 @JoinColumn(name="fk_routeId")
	 private AddRoute addroute;
	
}

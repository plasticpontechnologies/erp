package com.plasticon.erp.model;
import java.sql.Date;
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
@Table(name="filterwise_details")
public class EnquiryToFilterwise {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int filterId;
	private Date dateOfEnquiry;
	private String enquiryType;
	private String reference;
	private String response;
	private String filterClass;
	
	 @OneToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name="fk_routeId")
	 private ClassDetails classdetails;
	
}

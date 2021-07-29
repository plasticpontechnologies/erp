package com.plasticon.erp.model;
import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Entity
@Data
@Table(name="issuereport_staff")
public class IssueReportStaff {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int reportStaffId;
	private String userType;
	private String staffPosition;
	private String selectBook;
	private String selectStaff;
	private Date fromDate;
	private Date toDate;
	private String type;
	
	
	
	
		
		  @JsonIgnore
		  @OneToOne(fetch = FetchType.EAGER)
		  @JoinColumn(name="fk_reportstaffId")
		  private StaffDetails staffdetails;
		 
	
	 
}

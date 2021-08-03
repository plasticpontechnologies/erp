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
import lombok.Data;

@Entity
@Data
@Table(name = "staff_details")
public class StaffDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int staffId;
	private String staffName;
	private String userName;
	private String password;	
	private Long mobileNumber;
	private Date joinDate;
	private String email;
//	private String position;
//	private String usertype;
//	private String department;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "sd_fk")
	private SchoolDepartmentDetails sdd;
	

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pId")
	private PositionDetails pd;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ut_fk")
	private UserType ut;
}

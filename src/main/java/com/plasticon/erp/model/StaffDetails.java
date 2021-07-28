package com.plasticon.erp.model;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	//private Date dateOfBirth;
	//private String gender;
	private Date joiningDate;
	private Long mobileNumber;
	private String email;
	private String position;
	private String Usertype;
	private String Department;
	

}

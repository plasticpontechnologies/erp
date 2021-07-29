package com.plasticon.erp.model;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Entity
@Data
@Table(name="add_book")
public class AddBook {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bId;
	private String subject;
	private String purpose;
	private String bookName;
	private String authorName;
	private String publisher;
	private int price;
	
	
	@JsonIgnore
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="fk_bId")
	private SubjectDetails subjectdetails;
	
	@JsonIgnore
	@ManyToOne(targetEntity = StudentAdmission.class)
	private List<StudentAdmission> stu;	
	
	@JsonIgnore
	@OneToMany(targetEntity = StaffDetails.class)
	private List<StaffDetails> staffdetails;
	
	
		
}

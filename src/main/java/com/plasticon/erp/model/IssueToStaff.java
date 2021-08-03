package com.plasticon.erp.model;
import java.sql.Date;
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
@Table(name="issue_staff")
public class IssueToStaff {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int issueId;
	private String bookIssue;
	private String selectStaff;
	private Date dateOfIssue;
	private Date dateOfReturn;
	private String remarks;
	
			 
	 @JsonIgnore
	 @ManyToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name="fk_issueId")
	 private AddBook addbook;
	 
	
	 
}

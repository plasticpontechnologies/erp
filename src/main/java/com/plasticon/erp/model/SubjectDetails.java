package com.plasticon.erp.model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.Data;

@Entity
@Data

@Table(name  = "subjects")
public class SubjectDetails {
	@Id
	
	@Column(name = "su_id")
	private int id;

	@Column(name = "su_name")
	private String subjectName;
	@OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name="CLASS_SUBJECT", joinColumns={@JoinColumn(name="SUBJECT_ID", referencedColumnName="SU_ID")}
    , inverseJoinColumns={@JoinColumn(name="CLASS_ID", referencedColumnName="CL_ID")})
    private Set<ClassDetails> sd;

	
}

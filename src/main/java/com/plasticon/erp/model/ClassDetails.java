package com.plasticon.erp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity

@Data
@Table(name = "classes")
public class ClassDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "cl_id")
	private int id;

	@Column(name = "cl_name")
	private String className;

	
	/*@OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name="CLASS_SUBJECT", joinColumns={@JoinColumn(name="CLASS_ID", referencedColumnName="CL_ID")}
    , inverseJoinColumns={@JoinColumn(name="SUBJECT_ID", referencedColumnName="SU_ID")})
    private Set<SubjectDetails> sd;*/


}

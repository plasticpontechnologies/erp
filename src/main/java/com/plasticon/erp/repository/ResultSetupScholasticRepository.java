package com.plasticon.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ResultSetupScholasticDetails;




@Repository
public interface ResultSetupScholasticRepository extends JpaRepository<ResultSetupScholasticDetails,Number>{

   
	
}

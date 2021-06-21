package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ResultSetupScholasticDetails;

@Repository
public interface ResultSetupScholasticRepository extends JpaRepository<ResultSetupScholasticDetails,Number>{

}

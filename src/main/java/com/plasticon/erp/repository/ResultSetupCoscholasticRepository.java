package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ResultSetupCoscholasticDetails;

@Repository
public interface ResultSetupCoscholasticRepository extends JpaRepository<ResultSetupCoscholasticDetails,Number> {

}

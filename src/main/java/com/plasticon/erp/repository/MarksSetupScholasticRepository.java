package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.MarksSetupScholasticDetails;

@Repository
public interface MarksSetupScholasticRepository extends JpaRepository<MarksSetupScholasticDetails,Number> {

}

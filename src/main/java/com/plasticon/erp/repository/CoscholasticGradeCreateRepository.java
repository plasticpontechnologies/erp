package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.CoscholasticGradeCreateDetails;

@Repository
public interface CoscholasticGradeCreateRepository extends JpaRepository<CoscholasticGradeCreateDetails,Number> {

}

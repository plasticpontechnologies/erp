package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.CoscholasticGradeResultDetails;

@Repository
public interface CoscholasticGradeResultRepository extends JpaRepository<CoscholasticGradeResultDetails,Number>{

}

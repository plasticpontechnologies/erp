package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.EvaluateExamResult;

@Repository
public interface EvaluateExamResultRespository extends JpaRepository<EvaluateExamResult, Number> {

}

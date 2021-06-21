package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.EvaluationExam;

@Repository
public interface EvaluationExamRepository extends JpaRepository<EvaluationExam, Number> {

}

package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.HomeworkEvaluationReport;
@Repository
public interface HomeworkEvaluationReportRepository extends JpaRepository<HomeworkEvaluationReport,Number> {

}

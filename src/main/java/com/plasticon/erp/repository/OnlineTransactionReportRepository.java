package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.OnlineTransactionReport;

@Repository
public interface OnlineTransactionReportRepository extends JpaRepository<OnlineTransactionReport, Number> {

}

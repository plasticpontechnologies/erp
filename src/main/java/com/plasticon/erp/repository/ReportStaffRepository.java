package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.IssueReportStaff;

@Repository
public interface  ReportStaffRepository extends JpaRepository<IssueReportStaff,Integer>{

}

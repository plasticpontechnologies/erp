package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.PrintPayslip;
@Repository
public interface PrintPayslipRepository extends JpaRepository<PrintPayslip,Integer> {

}

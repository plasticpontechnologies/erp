package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.FeePayment;

@Repository
public interface FeePaymentRepository extends JpaRepository<FeePayment, Number> {

}

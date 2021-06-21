package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.OnlineFeePaymentList;

@Repository
public interface OnlineFeePaymentListRepository extends JpaRepository<OnlineFeePaymentList, Number> {

}

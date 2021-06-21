package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ManagePaymentGateWay;

@Repository
public interface ManagePaymentGateWayRepository extends JpaRepository<ManagePaymentGateWay,Integer>{

}

package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ActivePaymentGateWay;

@Repository
public interface ActivePaymentGateWayRepository extends JpaRepository<ActivePaymentGateWay,Integer> {

}

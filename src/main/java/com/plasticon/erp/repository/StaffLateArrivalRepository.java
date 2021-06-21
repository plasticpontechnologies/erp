package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StaffLateArrival;
@Repository
public interface StaffLateArrivalRepository extends JpaRepository<StaffLateArrival,Number> {

}

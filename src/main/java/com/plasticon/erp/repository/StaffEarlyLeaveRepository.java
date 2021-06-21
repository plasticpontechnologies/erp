package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StaffEarlyLeave;
@Repository
public interface StaffEarlyLeaveRepository extends JpaRepository<StaffEarlyLeave,Number>{

}

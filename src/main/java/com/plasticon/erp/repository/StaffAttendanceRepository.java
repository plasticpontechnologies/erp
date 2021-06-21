package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StaffAttendance;
@Repository
public interface StaffAttendanceRepository extends JpaRepository<StaffAttendance,Number>{

}

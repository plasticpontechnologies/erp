package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.DisplayStaffAttendance;
@Repository
public interface DisplayStaffAttendanceRepository extends JpaRepository<DisplayStaffAttendance,Number>{

}

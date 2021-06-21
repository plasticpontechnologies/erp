package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.DisplayStudentAttendance;
@Repository
public interface DisplayStudentAttendanceRepository extends JpaRepository<DisplayStudentAttendance,Number> {

}

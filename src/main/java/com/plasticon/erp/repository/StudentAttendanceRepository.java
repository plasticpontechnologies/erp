package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StudentAttendance;
@Repository
public interface StudentAttendanceRepository extends JpaRepository<StudentAttendance,Number> {

}

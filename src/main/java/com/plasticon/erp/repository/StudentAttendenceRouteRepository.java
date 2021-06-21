package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StudentAttendenceRoute;
@Repository
public interface StudentAttendenceRouteRepository extends JpaRepository<StudentAttendenceRoute,Integer>{

}

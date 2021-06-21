package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StudentLateAndEarlyDeparture;
@Repository
public interface StudentLateAndEarlyDepartureRepository extends JpaRepository<StudentLateAndEarlyDeparture,Number> {

}

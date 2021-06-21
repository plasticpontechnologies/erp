package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StudentArrivalDeparture;

@Repository
public interface StudentArrivalDepartureRepository extends JpaRepository<StudentArrivalDeparture,Integer> {

}

package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.DayDetails;
@Repository
public interface DayRepository extends JpaRepository<DayDetails,Number> {

}

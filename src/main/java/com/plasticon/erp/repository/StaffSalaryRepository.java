package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StaffSalaryDetails;


@Repository
public interface StaffSalaryRepository extends JpaRepository<StaffSalaryDetails,Number> {

}

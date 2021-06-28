package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StaffLoginDetails;

@Repository
public interface StaffLoginDetailsRepository extends JpaRepository<StaffLoginDetails,Integer> {

}

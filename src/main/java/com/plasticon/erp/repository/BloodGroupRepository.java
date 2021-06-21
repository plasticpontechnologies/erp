package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.BloodGroup;

@Repository
public interface BloodGroupRepository extends JpaRepository< BloodGroup, Number>{

}

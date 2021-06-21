package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SectionTimeSlot;
@Repository
public interface SectionTimeSlotRepository extends JpaRepository<SectionTimeSlot,Number> {

}

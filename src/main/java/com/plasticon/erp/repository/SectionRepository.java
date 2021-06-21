package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SectionDetails;



@Repository
public interface SectionRepository extends JpaRepository<SectionDetails,Number> {

}
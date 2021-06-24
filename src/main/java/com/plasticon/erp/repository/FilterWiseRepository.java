package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.EnquiryToFilterwise;

@Repository
public interface FilterWiseRepository extends  JpaRepository<EnquiryToFilterwise,Integer>{

}

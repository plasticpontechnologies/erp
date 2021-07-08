package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ContactInfo;

@Repository
public interface ContactInfoRepository extends JpaRepository<ContactInfo, Number> {

}

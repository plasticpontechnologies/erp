package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.MessageDetails;

@Repository
public interface MessageDetailsRepository extends JpaRepository<MessageDetails,Number> {

}

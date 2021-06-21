package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.TransferClass;

@Repository
public interface TransferClassRepository extends JpaRepository<TransferClass, Number> {

}

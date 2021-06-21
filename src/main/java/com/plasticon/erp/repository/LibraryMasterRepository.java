package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.LibraryMaster;

@Repository
public interface LibraryMasterRepository extends JpaRepository<LibraryMaster,Integer>{

}

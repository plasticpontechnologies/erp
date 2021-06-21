package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.LibraryDetails;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryDetails,Number> {

}

package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ClassDetails;



@Repository
public interface ClassRepository extends JpaRepository<ClassDetails,Number> {

}

package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.classes;



@Repository

public interface classRepository extends JpaRepository<classes,Number>{

}

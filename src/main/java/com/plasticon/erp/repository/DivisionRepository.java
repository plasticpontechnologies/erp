package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.Division;

@Repository
public interface DivisionRepository extends JpaRepository<Division,Integer> {

}

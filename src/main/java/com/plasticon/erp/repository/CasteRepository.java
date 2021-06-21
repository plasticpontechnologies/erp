package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.Caste;

@Repository
public interface CasteRepository extends JpaRepository<Caste, Number> {

}

package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.Selection;

@Repository
public interface  SelectionRepository extends JpaRepository<Selection,Number> {

}

package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SendMessageSelection;

@Repository
public interface  SendMessageSelectionRepository extends JpaRepository<SendMessageSelection,Number> {

}

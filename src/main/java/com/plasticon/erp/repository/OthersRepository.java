package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SendSmsToOthers;

@Repository
public interface OthersRepository extends JpaRepository<SendSmsToOthers,Integer> {

}

package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.Message;

@Repository
public interface  MessageRepository  extends JpaRepository<Message,Number>{

}

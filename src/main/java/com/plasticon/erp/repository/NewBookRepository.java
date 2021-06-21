package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.NewBook;

@Repository
public interface  NewBookRepository extends JpaRepository<NewBook,Integer>{

}

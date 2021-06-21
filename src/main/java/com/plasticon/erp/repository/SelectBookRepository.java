package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SelectBook;

@Repository
public interface SelectBookRepository extends JpaRepository<SelectBook,Integer>{

}

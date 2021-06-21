package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.BookList;

@Repository
public interface BookListRepository extends JpaRepository<BookList,Integer> {

}

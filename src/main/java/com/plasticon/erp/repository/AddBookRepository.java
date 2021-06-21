package com.plasticon.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.AddBook;

@Repository
public interface  AddBookRepository extends JpaRepository<AddBook,Integer> {

	// List<AddBook> findAll();

}

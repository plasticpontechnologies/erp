package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.IssueReturn;

@Repository
public interface IssueReturnRepository extends JpaRepository<IssueReturn,Integer> {

}

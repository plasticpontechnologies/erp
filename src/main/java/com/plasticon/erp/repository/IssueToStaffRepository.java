package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.IssueToStaff;


@Repository
public interface IssueToStaffRepository extends JpaRepository<IssueToStaff,Integer>{

}

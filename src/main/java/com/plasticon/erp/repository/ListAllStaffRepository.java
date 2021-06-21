package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ListAllStaffDetails;


@Repository
public interface ListAllStaffRepository extends JpaRepository<ListAllStaffDetails,Number>{

}

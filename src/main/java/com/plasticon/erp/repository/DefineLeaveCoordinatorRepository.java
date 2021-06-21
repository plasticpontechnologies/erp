package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.DefineLeaveCoordinator;
@Repository
public interface DefineLeaveCoordinatorRepository extends JpaRepository<DefineLeaveCoordinator,Integer> {

}

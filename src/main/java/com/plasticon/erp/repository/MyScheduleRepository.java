package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.MySchedule;
@Repository
public interface MyScheduleRepository extends JpaRepository<MySchedule,Number>{

}

package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.MessSchedule;
@Repository
public interface MessRepository extends JpaRepository<MessSchedule, Number> {

}

package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ViewTimeTable;
@Repository
public interface ViewTimeTableRepository extends JpaRepository<ViewTimeTable,Number>{

}

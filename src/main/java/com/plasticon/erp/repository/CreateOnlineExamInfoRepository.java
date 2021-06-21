package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.CreateOnlineExamInfo;

@Repository
public interface CreateOnlineExamInfoRepository extends JpaRepository<CreateOnlineExamInfo, Number> {

}

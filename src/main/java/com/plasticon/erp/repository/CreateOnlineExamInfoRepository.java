package com.plasticon.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.CreateOnlineExamInfo;


@Repository
public interface CreateOnlineExamInfoRepository extends JpaRepository<CreateOnlineExamInfo, Number> {
	
	 @Query("SELECT e FROM CreateOnlineExamInfo e WHERE e.subj.SubId = :subsId")
	 List<CreateOnlineExamInfo> findBySubs(int subsId);

}

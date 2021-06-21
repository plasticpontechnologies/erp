package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.OnlineExamDifficultyLevel;

@Repository

public interface OnlineExamDifficultyLevelRepository extends JpaRepository<OnlineExamDifficultyLevel, Number>{

}

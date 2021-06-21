package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.CertificateStudentDetailsSettings;
@Repository
public interface CertificateStudentDetailsSettingsRepository extends JpaRepository<CertificateStudentDetailsSettings,Number> {

}

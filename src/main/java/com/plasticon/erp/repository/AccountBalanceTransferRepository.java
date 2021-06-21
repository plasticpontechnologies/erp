package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.AccountBalanceTransfer;
@Repository
public interface AccountBalanceTransferRepository extends JpaRepository<AccountBalanceTransfer,Number>{

}

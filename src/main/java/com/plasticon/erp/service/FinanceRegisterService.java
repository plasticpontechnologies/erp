package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.FinanceRegister;
import com.plasticon.erp.repository.FinanceRegisterRepository;

@Service
public class FinanceRegisterService {
@Autowired
FinanceRegisterRepository financeRegisterRepository;

public List<FinanceRegister> getFinanceRegisterDetails(){
	return financeRegisterRepository.findAll();
}
public void saveFinanceRegisterDetails(FinanceRegister financeRegister) {
	financeRegisterRepository.save(financeRegister);
}
public void deleteFinanceRegisterDetails(int financeRegisterId) {
	financeRegisterRepository.deleteById(financeRegisterId);
}
}

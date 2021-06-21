package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.CreateAccountType;
import com.plasticon.erp.repository.CreateAccountTypeRepository;

@Service
public class CreateAccountTypeService {
@Autowired
CreateAccountTypeRepository createAccountTypeRepository;

public void createAccountType(CreateAccountType createAccountType) {
	createAccountTypeRepository.save(createAccountType);
}
public List<CreateAccountType> getAccountTypeDetails() {
	return createAccountTypeRepository.findAll();
}
public void deleteAccounttypeById(int id) {
	createAccountTypeRepository.deleteById(id);
}
}
